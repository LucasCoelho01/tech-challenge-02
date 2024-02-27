package com.lucas.techchallenge.core.usecases;

import com.lucas.techchallenge.common.daos.UserDao;
import com.lucas.techchallenge.communication.gateways.UserRepository;
import com.lucas.techchallenge.core.entities.User;
import com.lucas.techchallenge.common.dtos.UserDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserUseCase {
    public User createUser(UserDto userDto, UserRepository userRepository) throws Exception {
        User user = new User(userDto);

        userRepository.save(new UserDao(user));

        return user;
    }

    public List<User> gerAllUsers(UserRepository userRepository) {
        List<UserDao> usersDao = userRepository.findAll();
        List<User> users = new ArrayList<>();

        usersDao.forEach(userDao -> {
            try {
                User user = new User(userDao);
                users.add(user);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        return users;
    }
}
