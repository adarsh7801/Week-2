// Package declaration
package com.ridehailing;

// Main class to test the ride-hailing application
public class Main {

    // Method to calculate fare for different vehicle types dynamically using polymorphism
    public static void calculateFareForVehicle(Vehicle vehicle, double distance) {
        // Displaying vehicle details
        System.out.println(vehicle.getVehicleDetails());

        // Calculating and displaying the fare
        double fare = vehicle.calculateFare(distance);
        System.out.println("Calculated Fare: " + fare);
    }

    // Main method
    public static void main(String[] args) {

        // Creating vehicle objects for different types of vehicles
        Car car = new Car("V123", "John Doe", 10.0, "Downtown");
        Bike bike = new Bike("V456", "Jane Smith", 5.0, "Uptown");
        Auto auto = new Auto("V789", "Mark Lee", 8.0, "Suburbs");

        // Testing the calculateFareForVehicle method for different vehicle types
        System.out.println("For Car:");
        calculateFareForVehicle(car, 15);  // Distance = 15 km
        System.out.println();

        System.out.println("For Bike:");
        calculateFareForVehicle(bike, 15);  // Distance = 15 km
        System.out.println();

        System.out.println("For Auto:");
        calculateFareForVehicle(auto, 15);  // Distance = 15 km
    }
}
