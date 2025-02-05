// Package declaration
package com.fooddeliverysystem;

// Class VegItem extending FoodItem and implementing Discountable
public class VegItem extends FoodItem implements Discountable {

    // Constructor to initialize veg item details
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Overriding method to calculate total price for veg items
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
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
        return "Discount applicable on Veg Items.";
    }
}
