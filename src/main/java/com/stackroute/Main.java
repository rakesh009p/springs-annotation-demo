package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Config;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Movie movie = context.getBean(Movie.class);
        Actor actor = context.getBean(Actor.class);
        System.out.println(actor.toString());
        System.out.println(movie.toString());
    }
}