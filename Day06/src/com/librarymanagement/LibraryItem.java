// Package declaration
package com.librarymanagement;

// Abstract class LibraryItem representing a generic library item
abstract class LibraryItem {

    // Initializing variables
    private String itemId;  // Unique ID for the library item
    private String title;   // Title of the library item
    private String author;  // Author of the library item

    // Constructor to initialize library item details
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Method to get item details
    public String getItemDetails() {
        return "Item ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }

    // Abstract method to get loan duration
    // This will be implemented differently for each type of library item
    abstract int getLoanDuration();
}
