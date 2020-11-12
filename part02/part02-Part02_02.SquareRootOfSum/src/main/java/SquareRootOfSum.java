
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double num1 = Double.valueOf(scanner.nextLine());
        
        double num2 = Double.valueOf(scanner.nextLine());
        
        double total = num1 + num2;
        
        double squareRoot = Math.sqrt(total);
        System.out.println(squareRoot);

    }
}
