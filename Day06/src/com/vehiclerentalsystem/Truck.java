//package name
package com.vehiclerentalsystem;

//truck class extending vehicle class and implementing insurable class
public class Truck extends Vehicle implements Insurable{

    //initializing variable
    int days;

    //constructor
    Truck(String vehicleNumber, String vehicleType, double rentalRate, int days) {
        super(vehicleNumber, vehicleType, rentalRate);
        this.days = days;

    }

    //overriding method
    @Override
    double calculateRentalRate() {

        return (days*getRentalRate());
    }

    //overriding method
    @Override
    public String calculateInsurance() {

        return "Insured for 2 months more";
    }

    //overriding method
    @Override
    public String getInsuranceDetail() {

        return "The cost of insurance for 1 year is 40000";
    }
}
