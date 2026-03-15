package Main_Classes;
import Classes.*;

public class Main {

    public static void main(String[] args) {

        Students s1 = new Students();
        Book b1 = new Book();
        Car c1 = new Car();

        s1.name = "Ravi";
        b1.title = "Java Basics";
        c1.brand = "BMW";

        System.out.println(s1.name);
        System.out.println(b1.title);
        System.out.println(c1.brand);
    }

}