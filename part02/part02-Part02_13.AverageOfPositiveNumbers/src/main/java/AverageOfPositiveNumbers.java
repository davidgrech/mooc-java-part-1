
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double counterIteration = 0;
        double counterSum = 0;

        while (true) {
            System.out.println("Give a number:");
            double num = Double.valueOf(scanner.nextLine());
            
            if (num == 0 && counterSum != 0) {
                System.out.println("Average of numbers: " + (counterSum/counterIteration));
                break;
            } else if (num == 0 && counterSum <= 0){
                System.out.println("Cannot calculate the average");
                break;
            }
            
            if(num > 0){
                counterSum = counterSum + num;
                counterIteration++;  
            }
        }  
    }
}
