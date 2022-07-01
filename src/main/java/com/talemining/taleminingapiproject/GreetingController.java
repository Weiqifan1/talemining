package com.talemining.taleminingapiproject;

import com.talemining.taleminingapiproject.mandarin.services.MandarinService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    //https://www.youtube.com/watch?v=uDhumjWApl0
    //Spring Boot Quick Start 22 - Using Spring Initializr
//https://www.youtube.com/watch?v=MWLe1tqPmUo
    //Spring Boot REST Service: How to build a REST API in Java
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    // /greeting?name=Dan
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){

        MandarinService mandarinService = new MandarinService();
        String output = null;
        try {
            output = mandarinService.wordSplit(name);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new Greeting(1l, output);
    }
}
