// package com.example.demo.controller;

// import org.springframework.web.bind.annotation.*;

// import com.example.demo.model.User;

// @RestController
// @RequestMapping("/test-api")
// public class HelloController {

//     @GetMapping("/hello")
//     public String sayHello() {
//         return "Hello Spring Boot";
//     }

//     @GetMapping("/hello/{name}")
//     public String sayHelloName(@PathVariable String name) {
//         return "Hello, this course is learning by " + name;
//     }

//     @GetMapping("/add")
//     public int addNumbers(@RequestParam int a, @RequestParam int b) {
//         return a + b;
//     }

//     @PostMapping("/user")
//     public User createUser(@RequestBody User user) {
//         // For now, just return the same user (echo)
//         return user;
//     }
// }