package com.flower.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController{

    @GetMapping("/home")
    public String getHomePage() {
       return "I Love you to come to my Flower Shop!";
    }
}
