package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// This is also used to create a bean , it has some additional functionality
@RestController
public class Car {

    // This is called Dependency inject (Car class is dependent on Dog class)
    @Autowired
    private Dog dog;

    // This is used to create an Api
    @GetMapping("ok")
    public String ok(){
        return dog.fun();
    }

}
