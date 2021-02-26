
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int games = 0;
        int wins = 0;
        int losses = 0;
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.next();
        
        try (Scanner scanner2 = new Scanner(Paths.get(file))) {

            while (scanner2.hasNextLine()) {
                
                String line = scanner2.nextLine();
                
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitingPoints = Integer.valueOf(parts[3]);
                
                if(homeTeam.equals(team)){
                    games++;
                    if(homePoints > visitingPoints){
                        wins++;
                    } else {
                        losses++;
                    }

                }
                
                if(visitingTeam.equals(team)){
                    games++;
                    if(visitingPoints > homePoints){
                        wins++;
                    } else {
                        losses++;
                    }
                }
    
            }
            
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}
