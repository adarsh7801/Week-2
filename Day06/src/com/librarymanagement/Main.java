// Package declaration
package com.librarymanagement;

// Main class to test the library management system
public class Main {

    // Main method
    public static void main(String[] args) {

        // Creating objects for different library items
        LibraryItem book = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        LibraryItem magazine = new Magazine("M001", "National Geographic", "Various");
        LibraryItem dvd = new DVD("D001", "Inception", "Christopher Nolan");

        // Displaying details and loan duration for the book
        System.out.println(book.getItemDetails());
        System.out.println("Loan Duration (days): " + book.getLoanDuration());
        if (book instanceof Reservable) {
            Reservable reservable = (Reservable) book;
            System.out.println("Is available: " + reservable.checkAvailability());
            reservable.reserveItem();
        }
        System.out.println();

        // Displaying details and loan duration for the magazine
        System.out.println(magazine.getItemDetails());
        System.out.println("Loan Duration (days): " + magazine.getLoanDuration());
        if (magazine instanceof Reservable) {
            Reservable reservable = (Reservable) magazine;
            System.out.println("Is available: " + reservable.checkAvailability());
            reservable.reserveItem();
        }
        System.out.println();

        // Displaying details and loan duration for the DVD
        System.out.println(dvd.getItemDetails());
        System.out.println("Loan Duration (days): " + dvd.getLoanDuration());
        if (dvd instanceof Reservable) {
            Reservable reservable = (Reservable) dvd;
            System.out.println("Is available: " + reservable.checkAvailability());
            reservable.reserveItem();
        }
    }
}
