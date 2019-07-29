package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Actor actor() {
        Actor actor = new Actor("rakhi", 23, "male");
        return actor;
    }

    @Bean(name = "actor1")
    public Actor actor1() {
        Actor actor1 = new Actor("manish", 23, "male");
        return actor1;
    }

    @Bean(name = "actor2")
    public Actor actor2() {
        Actor actor2 = new Actor("vijay", 23, "male");
        return actor2;
    }

    @Bean(name = "movie")
    public Movie movie() {
        Movie movie = new Movie();
        movie.toString();
        return movie;
    }

    @Bean(name = "movie1")
    public Movie movie1() {
        Movie movie1 = new Movie();
        movie1.toString();
        return movie1;
    }
}
