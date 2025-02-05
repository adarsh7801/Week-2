// Package declaration
package com.ridehailing;

// Auto class extending Vehicle and implementing GPS
public class Auto extends Vehicle implements GPS {

    // Field specific to the Auto
    private String currentLocation;

    // Constructor to initialize auto details
    public Auto(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    // Overriding method to calculate fare for auto based on distance
    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    // Implementing method to get current location of the auto
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    // Implementing method to update the auto's location
    @Override
    public void updateLocation(String location) {
        currentLocation = location;
    }
}
