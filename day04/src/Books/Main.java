package Books;

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        // Create a Book object
        Book book1 = new Book("978-3-16-148410-0", "Java Programming", "John Smith");

        // Display book details using the public method
        System.out.println("Book 1 Details:");
        book1.displayBookDetails();

        // Set a new author name using the setter method
        book1.setAuthor("Jane Doe");
        System.out.println("\nBook 1 Details After Author Update:");
        book1.displayBookDetails();

        // Create an EBook object
        EBook eBook = new EBook("978-1-23-456789-0", "Advanced Java", "Mary Johnson");

        // Display EBook details
        System.out.println("\nEBook Details:");
        eBook.displayEBookDetails();
    }
}
