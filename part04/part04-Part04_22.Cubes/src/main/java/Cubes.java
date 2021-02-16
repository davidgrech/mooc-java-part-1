
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int cubed;
        int inputInt;
        
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }
            
            inputInt = Integer.parseInt(input);

            cubed = inputInt * inputInt * inputInt;
            
            System.out.println(cubed);

        }
        
    }
}
