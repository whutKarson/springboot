package com.springboot.chapter5.chapter5.db;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class DatasourceShow implements ApplicationContextAware {

    ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        DataSource dataSource = applicationContext.getBean(DataSource.class);
        System.out.println("----------------------------");
        System.out.println(dataSource.getClass().getSimpleName());
        System.out.println("----------------------------");

    }
}
