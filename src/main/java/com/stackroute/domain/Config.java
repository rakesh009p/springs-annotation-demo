package com.stackroute.domain;


import com.stackroute.demo.BeanLifeCycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemoBean;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;


public class Config {

   @Bean (name="beanDemo")
    public BeanPostProcessor beanDemo(){
       BeanPostProcessorDemoBean beanPostProcessorDemoBean= new BeanPostProcessorDemoBean() ;
       return  beanPostProcessorDemoBean;


}}