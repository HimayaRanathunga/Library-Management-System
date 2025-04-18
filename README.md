# 📚 Library Management System (Java Console Application)

This is a simple Library Management System built using Java. It allows you to manage books and users in a library. Users can register, borrow (issue), and return books. The app runs entirely through a console-based menu.

# ✅ Features
- Add new books to the library
- Register users
- Issue books to users
- Return books
- View all available books
- Simple command-line interface

# 🛠️ Technologies Used
- Java SE (Standard Edition)
- Java Collections (ArrayList)
- OOP Principles (Encapsulation, Class Interaction)
- Console I/O with Scanner

# 📂 Project Structure

LibrarySystem/
├── Book.java           // Book model class
├── User.java           // User model class
├── Library.java        // Core library management functions
└── Main.java           // Main class to run the application

# 📥 How to Run
1. Clone or download this repository.
2. Open the project in any Java IDE (e.g., IntelliJ IDEA, Eclipse, NetBeans).
3. Compile and run Main.java.
4. Use the command-line menu to interact with the system.

# 📄 Sample Book & User Class
Book.java

public class Book {
String id, title, author;
boolean isIssued = false;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return "[" + id + "] " + title + " by " + author + (isIssued ? " (Issued)" : " (Available)");
    }
}
User.java

public class User {
String id, name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
# 📌 Example Usage

=== Library Menu ===
1. Add Book
2. Register User
3. View All Books
4. Issue Book
5. Return Book
6. Exit
   Choose an option:

# 📧 Contact
   Created by Himaya Ranathunga
   Feel free to reach out for feedback or improvements!
 
