package com.example.lazy.countries;

import org.springframework.stereotype.Component;

@Component
public class UK implements Country {

    public UK(){
        System.out.println("In cosntructor: " + getClass().getSimpleName());
    }

    @Override
    public String getName() {
        return "UK";
    }
}
