package com.stackroute;


import com.stackroute.demo.BeanLifeCycleDemoBean;
import com.stackroute.domain.Config;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

        BeanLifeCycleDemoBean demoBean = applicationContext.getBean("beanLifeCycleDemoBean", BeanLifeCycleDemoBean.class);
        System.out.println(demoBean.getMessage());

        applicationContext.close();


    }
}