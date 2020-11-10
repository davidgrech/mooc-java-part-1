
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Greetings! How are you doing?");

        // Write your program here
        String message = scanner.nextLine();
        
        System.out.println("Oh, how interesting. Tell me more!");
        
        String messageTwo = scanner.nextLine();
        
        System.out.println("Thanks for sharing!");
        
    }
}
