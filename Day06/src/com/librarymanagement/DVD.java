// Package declaration
package com.librarymanagement;

// Class DVD extending LibraryItem and implementing Reservable
public class DVD extends LibraryItem implements Reservable {

    // Constructor to initialize DVD details
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    // Overriding method to return the loan duration for DVDs
    @Override
    int getLoanDuration() {
        return 3; // Loan duration for DVDs is 3 days
    }

    // Overriding method to reserve a DVD
    @Override
    public boolean reserveItem() {
        System.out.println("DVD reserved.");
        return true; // Reservation successful
    }

    // Overriding method to check availability of the DVD
    @Override
    public boolean checkAvailability() {
        return true; // DVD is available
    }
}
