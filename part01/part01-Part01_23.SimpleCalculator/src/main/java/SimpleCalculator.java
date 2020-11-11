
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");

        // Write your program here
        int first = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        
        int second = Integer.valueOf(scanner.nextLine());
        
        int plus = first + second;
        int minus = first - second;
        int times = first * second;
        
        double average = (double) first / second;
        
        System.out.println(first + " + " + second + " = " + plus);
        System.out.println(first + " - " + second + " = " + minus);
        System.out.println(first + " * " + second + " = " + times);
        System.out.println(first + " / " + second + " = " + average);

    }
}
