package com.lucas.techchallenge.core.usecases;

import com.lucas.techchallenge.common.daos.UserDao;
import com.lucas.techchallenge.common.dtos.UserDto;
import com.lucas.techchallenge.communication.gateways.UserRepository;
import com.lucas.techchallenge.core.entities.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserUseCaseTest {

    @InjectMocks
    private UserUseCase userUseCase;

    @Mock
    private UserRepository userRepository;

    @Test
    @DisplayName("Create user usecase")
    public void shouldCreateUser() throws Exception {
        UserDto userDto = new UserDto("Lucas", "12345678910", "12345678910");

        when(userRepository.save(any(UserDao.class))).thenReturn(new UserDao(new User(userDto)));

        var user = userUseCase.createUser(userDto, userRepository);

        assertNotNull(user.getId());
        assertEquals(userDto.userName, user.getUsername());
        assertEquals(userDto.email, user.getEmail().getEmail());
        assertEquals(userDto.cpf, user.getCpf().getCpf());
    }
}