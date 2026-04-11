package org.module.test.controllers;

import org.module.test.converters.UserMapper;
import my.hellojaxb.domain.UserCommand;
import org.module.test.entities.User;

public class UserController {

    User saveUser(UserCommand user) {
        return UserMapper.INSTANCE.userCommandToUser(user);
    }

}
