//package
package com.vehicleandtransportsystem;

//class name
public class Vehicle {

    //initializing variables
    int max_speed;
    String fuel_Type;

    //constructor
    public Vehicle(int maxSpeed, String fuelType) {
        this.fuel_Type = fuelType;
        this.max_speed= maxSpeed;

    }

    //displayinfo method
    public void displayinfo(){
        System.out.println("Fuel type "+fuel_Type);
        System.out.println("Max Speed "+max_speed);
    }

}
