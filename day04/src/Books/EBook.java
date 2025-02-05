package Books;

// Subclass: EBook
class EBook extends Book {

    // Constructor for EBook
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);  // Call the parent class constructor
    }

    // Method to display EBook details (demonstrating the use of access modifiers)
    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN);     // Can access public variable from parent class
        System.out.println("Title: " + title);   // Can access protected variable from parent class
        System.out.println("Author: " + getAuthor()); // Access private author through the public getter
    }
}
