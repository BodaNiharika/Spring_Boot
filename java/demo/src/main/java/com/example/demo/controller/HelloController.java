package com.example.demo.controller;

import com.example.demo.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //handles incoming HTTP requests and sends responses back to the client
public class HelloController {

    //creating helloservice object to call the method in service layer
    private final HelloService helloService;
    public HelloController(HelloService helloService){ //injecting the service layer into the controller layer using constructor injection
        this.helloService = helloService;
    }
    @GetMapping("/hello") //runs this methos when get request comes
    public String hello1() {
        return helloService.getMessage();
    }    

    @GetMapping("/niharika")
    public String niharika() {
        return "Hello! Niharika is there.";
    }

    @GetMapping("/course")
    public String course() {
        // return "Hello! This is a course on Spring Boot.";
        return helloService.getCourseMessage();
    }
}
