package com.example.lazy.countries;

public class France implements Country {

    public France() {
        System.out.println("In cosntructor: " + getClass().getSimpleName());
    }

    @Override
    public String getName() {
        return "France";
    }
}
