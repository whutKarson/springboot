/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.chapter4.demo.service.impl;

import com.example.chapter4.demo.model.User;
import com.example.chapter4.demo.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void printUser(User user) {
        if(user == null) {
            throw new RuntimeException("please make sure parameter is not null!");
        }

        System.out.println("userId = " + user.getId());
        System.out.println("userName = " + user.getName());
        System.out.println("userNote = " + user.getNote());
    }
}
