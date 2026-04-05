package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/students")
public class StudentController {
    
    // @GetMapping("/students")
    // public String getStudents() {
    //     return "Getting all students";
    // }
    
    // @GetMapping("/students/{name}")
    //     public String getName(@PathVariable String name){
    //         return "Getting student by name: " + name;
    // }
    
    // @PostMapping("students/{name}")
    // public String createStudent(@RequestBody String student) {
    //     return "Student created: " + student;
    // }

    // @PutMapping("/students/{id}")
    // public String updateStudent(@PathVariable int id) {
    //     return "Student updated with id: " + id;
    // }

    // @DeleteMapping("/students/{id}")
    // public String deleteStudent(@PathVariable int id){
    //     return "student deleted: "+ id;
    // }
    
    /*@PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
        //TODO: process POST request
        
        return student;
        // JSON → Object → JSON
    }

    @GetMapping("/test")
    public Student testStudent() {
        Student s = new Student();
        s.setId(1);
        s.setName("Ravi");
        s.setAge(29);
        return s;
    }
    
    @PutMapping("students/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
        //TODO: process PUT request
        student.setId(id);
        return student;
    }

     @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        return "Student deleted with id: " + id;
    }*/

        // using service in the controller

    private final StudentService service;

        // Constructor Injection (IMPORTANT)

    public StudentController(StudentService service){
        this.service=service;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return service.createStudent(student);
    }

    @GetMapping
    public List<Student> getStudents() {
        return service.getAllStudents();
    }

     @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id) {
        return service.getStudentById(id);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
        return service.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        return service.deleteStudent(id);
    }
    
}
