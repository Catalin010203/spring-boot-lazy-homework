package com.example.lazy.control;

import com.example.lazy.countries.France;
import com.example.lazy.countries.Romania;
import com.example.lazy.countries.Russia;
import com.example.lazy.countries.UK;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;

public class RestControler {

    private France france;
    private Romania romania;
    private UK uk;
    private Russia russia;


    public RestControler() {
        System.out.println("In constructor: " + getClass().getName());
    }

    @GetMapping("/ro")
    public String getCountryRomania() {
        return romania.getName();
    }

    @GetMapping("/ru")
    public String getCountryRussia() {
        return russia.getName();
    }

    @GetMapping("/ro")
    public String getCountryFrance() {
        return france.getName();
    }

    @GetMapping("/ro")
    public String getCountryUK() {
        return uk.getName();
    }

}
