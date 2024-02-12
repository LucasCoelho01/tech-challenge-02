package com.lucas.techchallenge.core.usecases;

import com.lucas.techchallenge.common.daos.UserDao;
import com.lucas.techchallenge.communication.gateways.UserRepository;
import com.lucas.techchallenge.core.entities.User;
import com.lucas.techchallenge.common.dtos.UserDto;
import org.springframework.stereotype.Service;

@Service
public class UserUseCase {
    public User createUser(UserDto userDto, UserRepository userRepository) throws Exception {
        User user = new User(userDto);

        userRepository.save(new UserDao(user));

        return user;
    }
}
