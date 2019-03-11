/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.chapter4.demo.aspect;


import com.example.chapter4.demo.aspect.UserValidator.UserValidator;
import com.example.chapter4.demo.aspect.UserValidator.impl.UserValidatorImpl;

import com.example.chapter4.demo.model.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 使用Aspect声明该类是切面
 */
@Aspect
@Component
public class MyAspect {
/*    @DeclareParents(
            value = "com.example.chapter4.demo.service.impl.UserServiceImpl+",
            defaultImpl = UserValidatorImpl.class
    )
    public UserValidator userValidator;*/

    @Pointcut("execution(* com.example.chapter4.demo.service.impl.UserServiceImpl.printUser(..))")
    public void pointCut() {

    }

    @Before("pointCut() && args(user)")
    public void before(JoinPoint jp, User user){
        Object[] args = jp.getArgs();
        System.out.println("MyAspect before ....");

    }

    @After("pointCut()")
    public void after(){
        System.out.println("MyAspect after ....");
    }

    @AfterReturning("pointCut()")
    public void afterReturning(){
        System.out.println("MyAspect afeterReturning ....");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing(){
        System.out.println("MyAspect afterThrowing ....");
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("around before...");
        jp.proceed();
        System.out.println("around after...");
    }
}
