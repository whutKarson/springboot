package com.example.chapter4.demo;

import com.example.chapter4.demo.aspect.MyAspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    //启动切面
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
