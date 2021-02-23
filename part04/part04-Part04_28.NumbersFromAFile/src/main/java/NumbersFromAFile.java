
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int total = 0;
        int number;
        
        try (Scanner scanner2 = new Scanner(Paths.get(file))) {

            while (scanner2.hasNextLine()) {
                
                number = Integer.parseInt(scanner2.nextLine());
                
                if(number >= lowerBound && number <= upperBound){
                    total++;
                } 

            }
            
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        System.out.println("Numbers: " + total);
    }

}
