package com.example.demo;

import org.springframework.stereotype.Component;

// This is used to create a bean so that it gets into ioc container
@Component
public class Dog {
    public String fun(){
        return "Something";
    }
}
