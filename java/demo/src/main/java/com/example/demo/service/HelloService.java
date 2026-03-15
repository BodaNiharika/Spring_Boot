package com.example.demo.service;


import org.springframework.stereotype.Service;

@Service //this class contains business logic (create and manage it as a spring boot bean)
public class HelloService {

    public String getMessage(){
        return "Hello from Service Layer";
    }
    
    public String getCourseMessage() {
        return "Spring Boot Development Course";
    }
}
