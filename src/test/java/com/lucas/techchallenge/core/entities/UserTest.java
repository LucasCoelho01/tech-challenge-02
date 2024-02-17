package com.lucas.techchallenge.core.entities;

import com.lucas.techchallenge.common.dtos.UserDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserTest {

    @Test
    @DisplayName("Create user entity")
    public void shouldCreateUser() throws Exception {
        UserDto userDto = new UserDto("Lucas", "12345678910", "12345678910");
        User user = new User(userDto);

        assertNotNull(user);
    }

    @Test
    @DisplayName("Exception when create User because name is empty")
    public void shouldThrowsException() throws Exception {
        UserDto userDto = new UserDto("", "12345678910", "12345678910");

        assertThrows(Exception.class, () -> new User(userDto));
    }
}