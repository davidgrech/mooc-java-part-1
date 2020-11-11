
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give a number:");
        
        int num1 = Integer.valueOf(scan.nextLine());
        
        if(num1%2==1||num1%2==-1){
            System.out.println("Number "+num1+" is odd.");
        } else if (num1%2==0){
            System.out.println("Number "+num1+" is even.");
        }
    }
}
