
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");

        // Write your program here
        int first = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        
        int second = Integer.valueOf(scanner.nextLine());
        
        int total = first + second;
        
        double average = (double) total / 2;
        
        System.out.println("The average is " + average);

    }
}
