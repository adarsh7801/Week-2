// Package declaration
package com.librarymanagement;

// Class Book extending LibraryItem and implementing Reservable
public class Book extends LibraryItem implements Reservable {

    // Constructor to initialize book details
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    // Overriding method to return the loan duration for books
    @Override
    int getLoanDuration() {
        return 14; // Loan duration for books is 14 days
    }

    // Overriding method to reserve a book
    @Override
    public boolean reserveItem() {
        System.out.println("Book reserved.");
        return true; // Reservation successful
    }

    // Overriding method to check availability of the book
    @Override
    public boolean checkAvailability() {
        return true; // Book is available
    }
}
