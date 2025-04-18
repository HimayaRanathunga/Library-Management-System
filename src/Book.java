public class Book {
    String id;
    String title;
    String author;
    boolean isIssued;

    public Book (String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }
    public String toString(){
        return "Book ID: " + id+ ", Title: " +title+", Author: "+ author + ", Issued: " + isIssued ;
    }
}
