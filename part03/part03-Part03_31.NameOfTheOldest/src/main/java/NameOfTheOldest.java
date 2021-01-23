
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        int age = 0;
        int highest = 0;
        String name = "";
        
        while(!username.equals("")){
            String[] splitSentence = username.split(",");
            
            age = Integer.valueOf(splitSentence[1]);
            
            if (age > highest){
                highest = age;
                name = splitSentence[0];
            }

            username = scanner.nextLine();
        }
        
        System.out.println("Name of the oldest is: " + name);
    }
}
