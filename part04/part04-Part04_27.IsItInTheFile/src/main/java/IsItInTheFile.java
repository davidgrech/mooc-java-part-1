
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        String found = "";
        
        try (Scanner scanner2 = new Scanner(Paths.get(file))) {

            while (scanner2.hasNextLine()) {
                if(scanner2.nextLine().equals(searchedFor)){
                    found = "Found!";
                    break;
                } else {
                    found = "Not found.";
                }

            }
            
            System.out.println(found);

        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
