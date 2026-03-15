package Main_Classes;
import Classes.com.practice.app.*;
public class Main_com_practice_app {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Alice";
        student.age = 20;

        Teacher teacher = new Teacher();
        teacher.name = "Mr. Smith";
        teacher.age = 45;

        Course course = new Course();
        course.name = "Java Programming";
        course.duration = 40;

        System.out.println("Student Name: " + student.name);
        System.out.println("Student Age: " + student.age);
        System.out.println("Teacher Name: " + teacher.name);
        System.out.println("Teacher Age: " + teacher.age);
        System.out.println("Course Name: " + course.name);
        System.out.println("Course Duration: " + course.duration + " hours");
    }
}