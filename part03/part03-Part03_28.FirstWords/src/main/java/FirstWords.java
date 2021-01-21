
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String username = scanner.nextLine();
        
        while(!username.equals("")){
        
            String[] splitSentence = username.split(" ");

            System.out.println(splitSentence[0]);

            username = scanner.nextLine();
            
        }
    }
}
