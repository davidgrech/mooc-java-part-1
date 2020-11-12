
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double num = Double.valueOf(scanner.nextLine());
        
        double squared = num * num;
        
        System.out.println(squared);
                
    }
}
