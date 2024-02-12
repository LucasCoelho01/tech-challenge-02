package com.lucas.techchallenge.common.dtos;

public class UserDto {
    public String userName;
    public String cpf;
    public String email;

    public UserDto() {}

    public UserDto(String userName, String cpf, String email) {
        this.userName = userName;
        this.cpf = cpf;
        this.email = email;
    }
}
