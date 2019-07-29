package com.stackroute.domain;

public class Actor {
    String name;
    int age;
    String gender;





    public Actor(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
