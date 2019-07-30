package com.stackroute.domain;


import com.stackroute.demo.BeanLifeCycleDemoBean;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;


public class Config {

    Actor actor1, actor2, actor3;

    @Bean(name = "actor1")
    public Actor getActor1() {

        actor1 = new Actor("rakesh", "male", 22);
        return actor1;
    }

    @Bean(name = "actor2")
    public Actor getActor2() {

        actor2 = new Actor("manish", "male", 25);
        return actor2;
    }

    @Bean(name = "actor3")
    public Actor getActor3() {

        actor3 = new Actor("that is vijay", "male", 26);
        return actor3;
    }


    @Bean(name = "movie1")
    public Movie getMovie1() {
        Movie movie1 = new Movie();

        movie1.setActor1(actor1);
        movie1.setActor2(actor2);
        movie1.setActor3(actor3);


        return movie1;
    }


    @Bean(name = "beanLifeCycleDemoBean")
    public BeanLifeCycleDemoBean getBeanLife() {

        BeanLifeCycleDemoBean beanLifeCycleDemoBean = new BeanLifeCycleDemoBean();
        beanLifeCycleDemoBean.setMessage("beanLifeCycle");
        return beanLifeCycleDemoBean;
    }


}