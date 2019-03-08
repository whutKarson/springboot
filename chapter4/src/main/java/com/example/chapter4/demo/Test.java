/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.chapter4.demo;

import com.example.chapter4.demo.intercept.MyInterceptor;
import com.example.chapter4.demo.proxy.ProxyBean;
import com.example.chapter4.demo.service.HelloService;
import com.example.chapter4.demo.service.impl.HelloServiceImpl;

public class Test {

    public static void main(String[] args) {
        testProxy();
    }

    private static void testProxy() {
        HelloService helloService = new HelloServiceImpl();
        HelloService proxy = (HelloService) ProxyBean.getProxyBean(helloService, new MyInterceptor());
        proxy.sayHello("zhangsan");
        System.out.println("\n#################name is null!!##############\n");
        proxy.sayHello(null);
    }
}
