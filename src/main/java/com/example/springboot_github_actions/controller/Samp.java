package com.example.springboot_github_actions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Samp {
    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }
}
