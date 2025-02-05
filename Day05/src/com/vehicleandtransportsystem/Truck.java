//package name
package com.vehicleandtransportsystem;

//class truck extending class vehicle
public class Truck extends Vehicle{

    //initializing variable
    int seatCapacity = 2;

    //constructor
    public Truck(int max_speed, String fuel_Type){
        super(max_speed, fuel_Type);
    }

    //overriding displayinfo method
    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("The seat capacity is "+seatCapacity);
        System.out.println();
    }
}
