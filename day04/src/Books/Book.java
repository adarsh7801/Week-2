package Books;

// Parent class: Book
public class Book {
    // Instance variables
    public String ISBN;     // public: can be accessed from anywhere
    protected String title;  // protected: can be accessed within the same package or by subclasses
    private String author;   // private: can only be accessed within this class

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to get the author name (getter)
    public String getAuthor() {
        return author;
    }

    // Public method to set the author name (setter)
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
