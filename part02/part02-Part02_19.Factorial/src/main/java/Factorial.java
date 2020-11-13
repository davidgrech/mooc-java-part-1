
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number?");

        int finish = Integer.valueOf(scanner.nextLine());
        
        int total = 1;

        for (int i = 1; i <= finish; i++) {
            total = total * i;
            System.out.println(total);
        }
        System.out.println("The sum is: " + total);
    }
}
