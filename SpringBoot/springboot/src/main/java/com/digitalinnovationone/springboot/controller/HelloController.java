package com.digitalinnovationone.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloController {

    private int count = 0;
    @GetMapping
    public String helloWorld() {
        count++;
        return "Hello, Adelino no navegador! Ja visitei esta pagina:" + Integer.toString(count) + "Vezes";
    }

}
