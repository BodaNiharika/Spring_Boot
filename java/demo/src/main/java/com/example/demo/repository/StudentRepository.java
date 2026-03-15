package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Student;

// below by extending JpaRepository, we get alll the methods like save(), findById(), findAll(), deleteById(), etc for free without writing any code
// i.e we dont write sql queries manually(this is the power of spring data jpa) and we can perform all the crud operations on the student table in the database using these methods
// we  used an inteface to create the repo for DB operation in spring boot
// jpa is interface (Student -> entity class, Integer -> type of primary key)
// sprint automatically generate like
/*class StudentRepositoryImpl implements StudentRepository {

   save()
   findById()
   findAll()
   deleteById()
// Because Spring Data JPA automatically generates the implementation at runtime.
}*/
/* 
Application Start
      ↓
Spring scans repository interfaces
      ↓
Spring generates implementation class
      ↓
StudentRepository bean is created
*/
//Interfaces extend other interfaces (here we see extends not implements)
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
