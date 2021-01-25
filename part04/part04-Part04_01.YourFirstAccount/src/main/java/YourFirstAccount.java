
public class YourFirstAccount {

    public static void main(String[] args) {
        
        Account firstAccount = new Account("David", 100.00);
        
        firstAccount.deposit(20.0);
        
        System.out.println(firstAccount.toString());
        
    }
}
