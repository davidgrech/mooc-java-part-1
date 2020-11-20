
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("Search for?");
        
        String chosen = scanner.nextLine();
        
        int found = 0;
        
        for(int i = 0; i < list.size(); i++) {
            
            if(list.get(i).equals(chosen)){
                System.out.println(chosen + " was found!");
                found++;
                break;
            }
        }
        if(found == 0){
            System.out.println(chosen + " was not found!");
        }
    }
}
