package com.lucas.techchallenge.communication.controllers;

import com.lucas.techchallenge.common.dtos.UserDto;
import com.lucas.techchallenge.communication.gateways.UserRepository;
import com.lucas.techchallenge.core.entities.User;
import com.lucas.techchallenge.core.usecases.UserUseCase;
import org.springframework.beans.factory.annotation.Autowired;

public class UserController {

    @Autowired
    private UserUseCase userUseCase;

    @Autowired
    private UserRepository userRepository;
    public User createUser(UserDto userDto) throws Exception {
        return userUseCase.createUser(userDto, userRepository);
    }
}
