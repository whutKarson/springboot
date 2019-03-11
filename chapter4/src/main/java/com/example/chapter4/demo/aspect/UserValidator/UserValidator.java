package com.example.chapter4.demo.aspect.UserValidator;

import com.example.chapter4.demo.model.User;
import org.springframework.stereotype.Service;


public interface UserValidator {
    //檢測用戶是否爲空
    public boolean validate(User user);
}
