
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        int age = 0;
        int highest = 0;
        
        while(!username.equals("")){
            String[] splitSentence = username.split(",");
            
            age = Integer.valueOf(splitSentence[1]);
            
            if (age > highest){
                highest = age;
            }

            username = scanner.nextLine();
        }
        
        System.out.println("Age of the oldest is: " + highest);
    }
}
