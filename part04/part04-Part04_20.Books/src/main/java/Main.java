import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.print("PublicationYear: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            //A new book is added to the list
            bookList.add(new Book(title, pages, publicationYear));
            
        }
        
        System.out.println("");
        
        System.out.println("What information will be printed?");
        String input = scanner.nextLine();

        for (Book books: bookList) {
            
            if(input.equals("everything")){
                System.out.println(books.toString());
            } else if (input.equals("name")){
                System.out.println(books.getTitle());
            }
            
        }

    }
}
