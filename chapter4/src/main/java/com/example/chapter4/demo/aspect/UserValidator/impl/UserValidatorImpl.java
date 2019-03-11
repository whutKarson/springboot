package com.example.chapter4.demo.aspect.UserValidator.impl;

import com.example.chapter4.demo.aspect.UserValidator.UserValidator;
import com.example.chapter4.demo.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserValidatorImpl implements UserValidator {
    @Override
    public boolean validate(User user) {
        System.out.println("引入新的接口：" + UserValidator.class.getSimpleName());
        return user != null;
    }
}
