//package name
package com.vehiclerentalsystem;

//car class extending vehicle class and implementing insurable class
public class Car extends Vehicle implements Insurable{

    //initializing variable
    int days;

    //constructor
    Car(String vehicleNumber, String vehicleType, double rentalRate, int days) {
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
        return "Insured for 5 months more";
    }

    //overriding method
    @Override
    public String getInsuranceDetail() {

        return "The cost of insurance for 1 year is 8000";
    }
}
