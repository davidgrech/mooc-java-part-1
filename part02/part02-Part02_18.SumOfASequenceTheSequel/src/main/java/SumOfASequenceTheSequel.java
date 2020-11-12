
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number?");

        int start = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Last number?");

        int finish = Integer.valueOf(scanner.nextLine());
        int total = 0;

        for (int i = start; i <= finish; i++) {
            total = total + i;
            System.out.println(i);
        }
        System.out.println("The sum is: " + total);
    }
}
