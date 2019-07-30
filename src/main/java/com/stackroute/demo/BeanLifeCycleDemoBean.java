package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean {

    String message;
    public void myMethod() {
        System.out.println("method started");
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @PostConstruct
    public void customInit() {

        System.out.println("running Init method");
    }

    @PreDestroy
    public void customDestroy() {

        System.out.println("running Destroy method");

    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("after all properties of bean were set");

    }

    @Override
    public void destroy() throws Exception {

        System.out.println("after the bean release");


    }
}