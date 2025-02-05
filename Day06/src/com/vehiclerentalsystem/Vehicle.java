//package
package com.vehiclerentalsystem;

//abstract class
abstract class Vehicle {

    //initializing variables
    private String vehicleNumber;
    private String vehicleType;
    private double rentalRate;

    //constructor
    Vehicle(String vehicleNumber, String vehicleType, double rentalRate){

        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.rentalRate = rentalRate;

    }

    //getter for rental rate
    public double getRentalRate() {
        return rentalRate;
    }

    //abstract method
    abstract double calculateRentalRate();

}
