package day11;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Library System Menu:");
            System.out.println("1. Issue a book");
            System.out.println("2. Generate report");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  
            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();  
                    System.out.print("Enter issue date (yyyy-mm-dd): ");
                    LocalDate issueDate = LocalDate.parse(scanner.nextLine());

                    Book book = new Book(title, price);
                    library.issueBook(book, issueDate);
                    System.out.println("Book issued and saved.");
                    break;
                
                case 2:
                                        library.generateReport();
                    System.out.println("Report generated: report.txt");
                    break;
                
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
