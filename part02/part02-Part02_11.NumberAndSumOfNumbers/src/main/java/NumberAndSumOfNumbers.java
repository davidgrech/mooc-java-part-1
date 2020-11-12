
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int counterIteration = 0;
        int counterSum = 0;

        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            }

            counterSum = counterSum + num;
            counterIteration++;
            
        }
        System.out.println("Number of numbers: " + counterIteration);
        System.out.println("Sum of the numbers: " + counterSum);
    }
}
