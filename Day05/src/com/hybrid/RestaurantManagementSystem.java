package com.hybrid;

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        // Create a Chef object
        Chef chef = new Chef("Gordon Ramsay", 101, "Italian Cuisine");
        System.out.println("Chef Details:");
        chef.displayDetails();
        chef.performDuties();

        System.out.println("\n-----------------------\n");

        // Create a Waiter object
        Waiter waiter = new Waiter("John Doe", 102, "Morning");
        System.out.println("Waiter Details:");
        waiter.displayDetails();
        waiter.performDuties();
    }
}
