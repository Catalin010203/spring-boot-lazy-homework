package com.example.lazy.control;

import com.example.lazy.countries.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private Country ro;
    private Country ru;
    private Country ukigndom;
    private Country fr;


    public Controller(@Qualifier("france") Country country,
                      @Qualifier("russia") Country country1,
                      @Qualifier("UK") Country country2,
                      @Qualifier("romania") Country country3) {
        System.out.println("In constructor: " + getClass().getName());
        fr = country;
        ru = country1;
        ro = country3;
        ukigndom = country2;
    }

    @GetMapping("/ro")
    public String getCountryRomania() {
        return ro.getName();
    }

    @GetMapping("/ru")
    public String getCountryRussia() {
        return ru.getName();
    }

    @GetMapping("/fr")
    public String getCountryFrance() {
        return fr.getName();
    }

    @GetMapping("/en")
    public String getCountryUK() {
        return ukigndom.getName();
    }

}
