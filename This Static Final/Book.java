class Book {
    // Static variable shared across all books
    private static String libraryName = "City Library";

    // Final variable to ensure ISBN cannot be changed
    private final String isbn;

    // Instance variables
    private String title;
    private String author;

    // Constructor to initialize book details
    public Book(String title, String author, String isbn) {
        this.title = title; // Using 'this' to resolve ambiguity
        this.author = author; // Using 'this' for clarity
        this.isbn = isbn; // Final variable initialized here
    }

    // Static method to display the library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details
    public void displayBookDetails() {
        if (this instanceof Book) { // Check if the object is an instance of the Book class
            System.out.println("Library: " + libraryName);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Invalid book object.");
        }
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        // Display library name using the static method
        Book.displayLibraryName();
        System.out.println();

        // Creating book objects
        Book book1 = new Book("1984", "George Orwell", "9780451524935");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");

        // Display book details
        book1.displayBookDetails();
        System.out.println();

        book2.displayBookDetails();
        System.out.println();

        // Verify instance using instanceof
        System.out.println("book1 is an instance of Book: " + (book1 instanceof Book));
        System.out.println("book2 is an instance of Book: " + (book2 instanceof Book));
    }
}
