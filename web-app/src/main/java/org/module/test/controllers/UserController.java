package org.module.test.controllers;

import my.hellojaxb.domain.UserCommand;
import org.module.test.entities.User;

public class UserController {

    User saveUser(UserCommand user) {
        return new User();
    }
}
