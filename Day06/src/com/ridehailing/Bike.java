// Package declaration
package com.ridehailing;

// Bike class extending Vehicle and implementing GPS
public class Bike extends Vehicle implements GPS {

    // Field specific to the Bike
    private String currentLocation;

    // Constructor to initialize bike details
    public Bike(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    // Overriding method to calculate fare for bike based on distance
    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    // Implementing method to get current location of the bike
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    // Implementing method to update the bike's location
    @Override
    public void updateLocation(String location) {
        currentLocation = location;
    }
}
