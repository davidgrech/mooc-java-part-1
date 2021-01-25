
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        int length = 0;
        int year = 0;
        String longest = "";
        
        int i = 0;
        double average = 0;
        double total = 0;
        
        while(!username.equals("")){
            String[] splitSentence = username.split(",");
            
            year = Integer.valueOf(splitSentence[1]);
            
            total += year;
            i++;
            
            if (splitSentence[0].length() > length){
                length = splitSentence[0].length();
                longest = splitSentence[0];
            }

            username = scanner.nextLine();
        }
        
        average = total/i;
        
        System.out.println("Longest name: " + longest);
        System.out.println("Average of birth years: " + average);
    }
}
