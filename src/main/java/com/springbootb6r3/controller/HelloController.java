package com.springbootb6r3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
 
    @GetMapping("/hello")
    public String getGreeting() {
        return "Hello Spring World! Diego Berenguer Celma";
    }
}