// Package declaration
package com.librarymanagement;

// Interface Reservable representing reservable behavior
public interface Reservable {

    // Method to reserve an item
    boolean reserveItem();

    // Method to check if the item is available for reservation
    boolean checkAvailability();
}
