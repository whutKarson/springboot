package com.example.chapter4.demo.aspect.controller;

import com.example.chapter4.demo.aspect.UserValidator.UserValidator;
import com.example.chapter4.demo.model.User;
import com.example.chapter4.demo.service.HelloService;
import com.example.chapter4.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    //注入用户服务
    @Autowired
    private UserService userService = null;

    //定义请求
    @RequestMapping("/print")
    public User printUser(Long id, String userName, String note) {
        User user = new User();
        user.setId(id);
        user.setName(userName);
        user.setNote(note);
        //强制轉換
        UserValidator userValidator = (UserValidator)userService;
        //驗證用戶是否爲空
        if (userValidator.validate(user)) {
            userService.printUser(user);
        }
        return user;
    }
}
