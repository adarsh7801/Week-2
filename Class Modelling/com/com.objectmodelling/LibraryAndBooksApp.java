package com.com.objectmodelling;

import java.util.ArrayList;
import java.util.List;

// Book Class
class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

// Library Class
class Library {
    private String name;
    private List<Book> books;

    // Constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display all books in the library
    public void displayBooks() {
        System.out.println("Library: " + name);
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }
}

// Main Class to Demonstrate Aggregation
public class LibraryAndBooksApp {
    public static void main(String[] args) {
        // Create Books
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        // Create Libraries
        Library library1 = new Library("Downtown Library");
        Library library2 = new Library("City Library");

        // Add Books to Libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book2); // Shared book
        library2.addBook(book3);

        // Display Books in Each Library
        library1.displayBooks();
        System.out.println();
        library2.displayBooks();
    }
}
