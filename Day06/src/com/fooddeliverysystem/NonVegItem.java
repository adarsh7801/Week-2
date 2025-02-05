// Package declaration
package com.fooddeliverysystem;

// Class NonVegItem extending FoodItem and implementing Discountable
public class NonVegItem extends FoodItem implements Discountable {

    // Additional charge for non-veg items
    private static final double NON_VEG_CHARGE = 20.0;

    // Constructor to initialize non-veg item details
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Overriding method to calculate total price for non-veg items
    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + NON_VEG_CHARGE;
    }

    // Overriding method to apply a discount to the total price
    @Override
    public double applyDiscount(double percentage) {
        double totalPrice = calculateTotalPrice();
        return totalPrice - (totalPrice * (percentage / 100));
    }

    // Overriding method to get discount details
    @Override
    public String getDiscountDetails() {
        return "Discount applicable on Non-Veg Items, excluding additional charges.";
    }
}
