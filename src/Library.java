import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();

    // Add new book
    public void addBook(Book book) {
        books.add(book);
        System.out.println(" Book added.");
    }

    // Register a user
    public void registerUser(User user) {
        users.add(user);
        System.out.println(" User registered: " + user.name);
    }

    // Issue book to user
    public void issueBook(String bookId, String userId) {
        for (Book book : books) {
            if (book.id.equals(bookId) && !book.isIssued) {
                book.isIssued = true;
                System.out.println(" Book issued to user ID: " + userId);
                return;
            }
        }
        System.out.println(" Book not found or already issued.");
    }

    // Return book
    public void returnBook(String bookId) {
        for (Book book : books) {
            if (book.id.equals(bookId) && book.isIssued) {
                book.isIssued = false;
                System.out.println(" Book returned.");
                return;
            }
        }
        System.out.println("️ Book not found or not issued.");
    }

    // Optional: View all books
    public void viewBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
