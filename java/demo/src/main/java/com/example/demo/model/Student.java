package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity //this class represents a table in the database and each instance of this class represents a row in the table(so student class-> student table in the database)
public class Student {
      
    // private keyword(encapsulation)
    // other classes cannot access these variables directly, they can only access them through methods (getters and setters)
      @Id //primary key of the table
      private int id;
      private String name;
      private int age;
      private String course;

        public int getId() {
                return id;
        } 
        
        public void setId(int id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public String getCourse(){
            return course;

        }

        public void setCourse(String course){
            this.course = course;
        }   
        
    
    }
