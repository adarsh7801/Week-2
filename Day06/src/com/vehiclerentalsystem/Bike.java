//package name
package com.vehiclerentalsystem;

//bike class extending vehicle class and implementing insurable class
public class Bike extends Vehicle implements Insurable{

    //initializing variable
    int days;

    //constructor
    Bike(String vehicleNumber, String vehicleType, double rentalRate, int days) {
        super(vehicleNumber, vehicleType, rentalRate);
        this.days = days;
    }

    //overriding method
    @Override
    double calculateRentalRate() {

        return (days* getRentalRate());
    }

    //method overriding
    @Override
    public String calculateInsurance() {

        return "Insured for 8 months more";
    }

    //method overriding
    @Override
    public String getInsuranceDetail() {

        return "The cost of insurance for 1 year is 2000";
    }
}
