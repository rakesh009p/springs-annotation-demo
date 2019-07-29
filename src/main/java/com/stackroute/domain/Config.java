package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Actor actor(){
        Actor actor= new Actor(String name, int age, String gender);



    }
    @Bean
    public Movie movie(){
        Movie movie=new Movie();
        movie.toString();
        return movie;
    }
    public Movie movie1()
    {
        Movie movie1= new Movie();
                movie1.toString();
                return movie1;
    }}
