// Package declaration
package com.ridehailing;

// Car class extending Vehicle and implementing GPS
public class Car extends Vehicle implements GPS {

    // Field specific to the Car
    private String currentLocation;

    // Constructor to initialize car details
    public Car(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    // Overriding method to calculate fare for car based on distance
    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    // Implementing method to get current location of the car
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    // Implementing method to update the car's location
    @Override
    public void updateLocation(String location) {
        currentLocation = location;
    }
}
