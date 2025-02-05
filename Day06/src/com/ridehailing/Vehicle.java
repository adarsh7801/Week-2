package com.ridehailing;

// Abstract class Vehicle representing a general vehicle
abstract class Vehicle {

    // Fields for vehicle details
    private String vehicleId;    // Unique ID of the vehicle
    private String driverName;   // Name of the driver
    private double ratePerKm;    // Rate per kilometer for the ride

    // Constructor to initialize vehicle details
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Concrete method to get vehicle details
    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate per Km: " + ratePerKm;
    }

    // Getter for ratePerKm
    public double getRatePerKm() {
        return ratePerKm;
    }

    // Abstract method to calculate fare based on distance
    abstract double calculateFare(double distance);
}
