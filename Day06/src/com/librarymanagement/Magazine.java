// Package declaration
package com.librarymanagement;

// Class Magazine extending LibraryItem and implementing Reservable
public class Magazine extends LibraryItem implements Reservable {

    // Constructor to initialize magazine details
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    // Overriding method to return the loan duration for magazines
    @Override
    int getLoanDuration() {
        return 7; // Loan duration for magazines is 7 days
    }

    // Overriding method to reserve a magazine
    @Override
    public boolean reserveItem() {
        System.out.println("Magazine reserved.");
        return true; // Reservation successful
    }

    // Overriding method to check availability of the magazine
    @Override
    public boolean checkAvailability() {
        return false; // Magazine is not available
    }
}
