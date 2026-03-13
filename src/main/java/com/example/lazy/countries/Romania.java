package com.example.lazy.countries;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Romania implements Country {

    public Romania() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }


    @Override
    public String getName() {
        return "Romania";
    }
}
