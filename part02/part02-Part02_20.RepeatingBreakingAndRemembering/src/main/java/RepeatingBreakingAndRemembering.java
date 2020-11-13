
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int counterSum = 0;
        int counterIteration = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            System.out.println("Give numbers:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1){
                System.out.println("Thx! Bye!");
                break;
            }
            if(num % 2 == 0){
                even++;
            } else if (num % 2 == 1){
                odd++;
            }
            
            counterIteration++;
            counterSum = counterSum + num;
 
        }
        System.out.println("Sum: " + counterSum);
        System.out.println("Numbers: " + counterIteration);
        System.out.println("Average: " + ((double)counterSum/counterIteration));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
