package com.example.lazy.countries;

public class UK implements Country {

    public UK(){
        System.out.println("In cosntructor: " + getClass().getSimpleName());
    }

    @Override
    public String getName() {
        return "UK";
    }
}
