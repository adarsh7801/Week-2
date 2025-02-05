// Package declaration
package com.fooddeliverysystem;

// Main class to test the food delivery system
public class Main {

    // Method to process an order
    public static void processOrder(FoodItem item, double discountPercentage) {
        // Displaying item details
        System.out.println(item.getItemDetails());
        System.out.println("Total Price: " + item.calculateTotalPrice());

        // Checking if the item is discountable
        if (item instanceof Discountable) {
            Discountable discountable = (Discountable) item;
            System.out.println(discountable.getDiscountDetails());
            double discountedPrice = discountable.applyDiscount(discountPercentage);
            System.out.println("Price after " + discountPercentage + "% discount: " + discountedPrice);
        }
    }

    // Main method
    public static void main(String[] args) {

        // Creating objects for veg and non-veg items
        FoodItem vegItem = new VegItem("Paneer Tikka", 200, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Curry", 300, 1);

        // Processing orders
        System.out.println("Processing Veg Item:");
        processOrder(vegItem, 10); // 10% discount for veg item
        System.out.println();

        System.out.println("Processing Non-Veg Item:");
        processOrder(nonVegItem, 5); // 5% discount for non-veg item
    }
}
