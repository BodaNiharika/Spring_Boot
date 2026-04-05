package com.example.demo.service;

import com.example.demo.repository.StudentRepository;
// import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;


@Service //creates object of this class(bean) and manage it in spring container (spring will automatically create studentService object)
public class StudentService {
    
    private final StudentRepository repository;
    // private List<Student> students = new ArrayList<>();

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Student createStudent(Student student){
        // students.add(student);
        // return student;
        return repository.save(student);
    }

    public List<Student> getAllStudents(){
        // return students;
        return repository.findAll();
    }

     public Student getStudentById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Student updateStudent(int id, Student student) {
        student.setId(id);
        // return student;
        return repository.save(student);
    }

    public String deleteStudent(int id) {
        // return "Student deleted with id: " + id;
         repository.deleteById(id);
        return "Deleted";
    }

    // write one ,ore method
}
