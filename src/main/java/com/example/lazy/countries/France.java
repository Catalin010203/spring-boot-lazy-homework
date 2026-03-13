package com.example.lazy.countries;

import org.springframework.stereotype.Component;

@Component
public class France implements Country {

    public France() {
        System.out.println("In cosntructor: " + getClass().getSimpleName());
    }

    @Override
    public String getName() {
        return "France";
    }
}
