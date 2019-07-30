package com.stackroute;



import com.stackroute.demo.BeanPostProcessorDemoBean;
import com.stackroute.domain.Config;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        BeanPostProcessorDemoBean beanPostProcessorDemoBean = applicationContext.getBean("beanDemo", BeanPostProcessorDemoBean.class);
        beanPostProcessorDemoBean.postProcessBeforeInitialization("beanDemo", "rakesh");
        beanPostProcessorDemoBean.postProcessAfterInitialization("beanDemo", "rakhi");


        applicationContext.close();


    }
}