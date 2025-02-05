//package name
package com.vehicleandtransportsystem;

//class car extending class vehicle
public class Car extends Vehicle{

    //initializing variable
    int seatCapacity;

    //constructor
    public Car(int max_speed, String fuel_Type, int seatCapacity){
        super(max_speed, fuel_Type);
        this.seatCapacity = seatCapacity;
    }

    //overriding diaplayinfo method
    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("The seat capacity is "+seatCapacity);
        System.out.println();
    }
}
