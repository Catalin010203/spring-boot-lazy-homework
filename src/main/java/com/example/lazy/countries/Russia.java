package com.example.lazy.countries;

import org.springframework.stereotype.Component;

@Component
public class Russia implements Country {

    public Russia() {
        System.out.println("In cosntructor: " + getClass().getSimpleName());
    }

    @Override
    public String getName() {
        return "Russia";
    }

}
