package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Movie movie() {
        Movie movie = new Movie();

        return movie;

    }

    @Bean
    public Actor actor() {
        Actor actor = new Actor();
        actor.setGender("male");
        actor.setName("rakesh");
        actor.setAge(22);

        return actor;
    }

}