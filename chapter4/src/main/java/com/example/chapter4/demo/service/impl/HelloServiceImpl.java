/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.chapter4.demo.service.impl;

import com.example.chapter4.demo.service.HelloService;

public class HelloServiceImpl implements HelloService {

    @Override
    public void sayHello(String name) {
        if ((null==name) || (name.trim()==""))
            throw new RuntimeException("parameter is null");
        System.out.println("Hello " + name);
    }
}
