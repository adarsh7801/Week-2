// Package declaration
package com.fooddeliverysystem;

// Abstract class FoodItem representing a generic food item
abstract class FoodItem {

    // Initializing variables
    private String itemName;  // Name of the food item
    private double price;     // Price per unit of the food item
    private int quantity;     // Quantity of the food item

    // Constructor to initialize food item details
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to get item details
    public String getItemDetails() {
        return "Item Name: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Getter for quantity
    public int getQuantity() {
        return quantity;
    }

    // Abstract method to calculate total price
    abstract double calculateTotalPrice();
}
