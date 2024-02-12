package com.lucas.techchallenge.core.entities;

import com.lucas.techchallenge.common.dtos.UserDto;
import lombok.Data;

import java.util.Objects;
import java.util.UUID;

@Data
public class User {
    private UUID id;
    private String username;
    private CPF cpf;
    private Email email;

    public User(UserDto userDto) throws Exception {
        validateUserName(userDto.userName);
        this.id = UUID.randomUUID();
        this.username = userDto.userName;
        this.cpf = new CPF(userDto.cpf);
        this.email = new Email(userDto.email);
    }

    private void validateUserName(String userName) throws Exception {
        boolean nameIsNull = Objects.isNull(userName);
        boolean nameIsEmpty = userName.isEmpty();
        boolean nameHasLessThanThreeLetters = userName.length() < 3;

        if (nameIsNull || nameIsEmpty || nameHasLessThanThreeLetters) {
            throw new Exception("Invalid username!!!!!!!!!");
        }
    }
}
