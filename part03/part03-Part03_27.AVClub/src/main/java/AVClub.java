
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String username = scanner.nextLine();
        
        while(!username.equals("")){
        
            String[] splitSentence = username.split(" ");
            
            for(String word : splitSentence){
                
                if(word.contains("av")){
                    System.out.println(word);
                }
                
            }
        
            username = scanner.nextLine();
            
        }
    }
}
