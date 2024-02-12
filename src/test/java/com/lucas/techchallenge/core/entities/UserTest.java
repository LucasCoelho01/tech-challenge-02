package com.lucas.techchallenge.core.entities;

import com.lucas.techchallenge.core.entities.dtos.UserDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserTest {

    @Test
    @DisplayName("Create User")
    public void shouldCreateUser() throws Exception {
        UserDto userDto = new UserDto("Lucas", "12345678910", "12345678910");

        User user = new User(userDto);

        assertNotNull(user);
    }
}