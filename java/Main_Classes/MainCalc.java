package Main_Classes;
import Classes.*;

public class MainCalc {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        int result = c.multiply(5, 4);
        int result2 = c.add(5, 4);      
        int result3 = c.subtract(5, 4);
        int result4 = c.divide(5, 4);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
