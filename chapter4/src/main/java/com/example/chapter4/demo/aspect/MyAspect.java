/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.chapter4.demo.aspect;


import org.aspectj.lang.annotation.*;

/**
 * 使用Aspect声明该类是切面
 */
@Aspect
public class MyAspect {

    @Pointcut("execution(* com.example.chapter4.demo.service.impl.UserServiceImpl.printUser(..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void before(){
        System.out.println("MyAspect before ....");
    }

    @After("pointCut()")
    public void after(){
        System.out.println("MyAspect before ....");
    }

    @AfterReturning("pointCut()")
    public void afterReturning(){
        System.out.println("MyAspect before ....");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing(){
        System.out.println("MyAspect before ....");
    }
}
