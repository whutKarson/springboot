/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.chapter4.demo.intercept;

import com.example.chapter4.demo.invoke.Invocation;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;


public class MyInterceptor implements Interceptor {


    @Override
    public boolean before() {
        System.out.println("Before......");
        return true;
    }

    @Override
    public void after() {
        System.out.println("after......");
    }

    @Override
    public Object around(Invocation invocation) throws InvocationTargetException, IllegalAccessException {
        System.out.println("around before......");
        Object obj =  invocation.proceed();
        System.out.println("around after......");

        return obj;
    }

    //是否使用本类的around方法
    @Override
    public boolean useAround() {
        return true;
    }

    /*
    Success in calling target method.
    Then call below method.
    */
    @Override
    public void afterReturning() {
        System.out.println("after Returning......");

    }

    /*
    Got exception while call target method.
    Then call below method.
     */
    @Override
    public void afterThrowing() {
        System.out.println("after throwing......");

    }
}
