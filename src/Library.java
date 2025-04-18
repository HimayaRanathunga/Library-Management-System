import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
        System.out.println(" Book added");
    }

    public void registerUser(User user) {
        users.add(user);
        System.out.println(book);
    }
    }

    public void issueBook (String bookId, String userId){
    for(Book book : books){
        if(book.id.equals(bookId) && !book.isIssued){
            book.isIssued = true;
            System.out.println("Book issued to user ID" + userId);
            return;
        }
    }
    System.out.println("Book not found ");

    public void returnBook (String bookId){
        for(Book book : books){
            if(book.id.equals(bookId) && book.isIssued){
                book.isIssued = false;
                System.out.println("Book returned");
                return;
            }
        }
        System.out.println("Book not found ");
        }
}
