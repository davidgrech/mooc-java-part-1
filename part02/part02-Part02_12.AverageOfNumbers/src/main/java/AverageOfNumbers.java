
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double counterIteration = 0;
        double counterSum = 0;

        while (true) {
            System.out.println("Give a number:");
            double num = Double.valueOf(scanner.nextLine());
            
            if (num == 0) {
                break;
            }
            
            counterSum = counterSum + num;
            counterIteration++;
            
        }
        System.out.println("Average of the numbers: " + (counterSum/counterIteration));
    }
}
