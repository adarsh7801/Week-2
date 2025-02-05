public class LibraryBook {
    // Attributes
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Default constructor
    public LibraryBook() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
        this.isAvailable = true; // Books are available by default
    }

    // Parameterized constructor
    public LibraryBook(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Getter and Setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getter and Setter for availability
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Method to borrow a book
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false; // Set the book as unavailable
            System.out.println("You have successfully borrowed \"" + title + "\".");
            return true;
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently unavailable.");
            return false;
        }
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Unavailable"));
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create books
        LibraryBook book1 = new LibraryBook("1984", "George Orwell", 12.99, true);
        LibraryBook book2 = new LibraryBook("The Great Gatsby", "F. Scott Fitzgerald", 10.99, false);

        // Display book details
        System.out.println("Books.Book 1 Details:");
        book1.displayBookDetails();

        System.out.println("\nBooks.Book 2 Details:");
        book2.displayBookDetails();

        // Borrow books
        System.out.println("\nAttempting to borrow Books.Book 1:");
        book1.borrowBook();

        System.out.println("\nAttempting to borrow Books.Book 2:");
        book2.borrowBook();

        // Display book details after borrowing
        System.out.println("\nBooks.Book 1 Details After Borrowing:");
        book1.displayBookDetails();

        System.out.println("\nBooks.Book 2 Details After Borrowing:");
        book2.displayBookDetails();
    }
}
