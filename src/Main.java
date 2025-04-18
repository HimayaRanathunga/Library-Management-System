//imports the Scanner class to allow input from the user via the console
import java.util.Scanner;

//Declares the main class that contains the entry point of the program
public class Main {
    //The main method, where java starts executing the program
    public static void main(String[] args) {
        //Creates an object of the Library class , can access its methods like addBook, RegisterUser, etc.
        Library library = new Library();
        //Creates a scanner object to get input from the user through the keyboard.
        Scanner scanner = new Scanner(System.in);

        //Starts an infinite loop so the menu keeps showing until the user decides to exit.
        while (true) {
            System.out.println("\n=== Library Menu ===");
            System.out.println("1. Add Book");
            System.out.println("2. Register User");
            System.out.println("3. View All Books");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            //Reads the user's menu choice(1 -6)
            int choice = scanner.nextInt();
            //Consumes the newline character left after nextInt()
            scanner.nextLine();

            //Executes different blocks of code based on the user's choice
            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(id, title, author));
                    break;

                case 2:
                    System.out.print("Enter User ID: ");
                    String userId = scanner.nextLine();
                    System.out.print("Enter User Name: ");
                    String name = scanner.nextLine();
                    library.registerUser(new User(userId, name));
                    break;

                case 3:
                    library.viewBooks();
                    break;

                case 4:
                    System.out.print("Enter Book ID to issue: ");
                    String issueId = scanner.nextLine();
                    System.out.print("Enter User ID: ");
                    String issueUser = scanner.nextLine();
                    library.issueBook(issueId, issueUser);
                    break;

                case 5:
                    System.out.print("Enter Book ID to return: ");
                    String returnId = scanner.nextLine();
                    library.returnBook(returnId);
                    break;

                case 6:
                    System.out.println(" Exiting...");
                    return;

                default:
                    System.out.println(" Invalid choice.");
            }
        }
    }
}
