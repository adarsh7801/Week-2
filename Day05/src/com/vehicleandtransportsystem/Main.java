//package name
package com.vehicleandtransportsystem;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        //initializing array of vehicle type
        Vehicle[] vehicle= new Vehicle[3];
        vehicle[0]= new Car(200, "Jet fuel", 4);
        vehicle[1]= new Truck(300, "Diesel");
        vehicle[2]= new Vehicle(130, "Petrol");

        //displaying result
        for (int i = 0; i < 3; i++) {
            vehicle[i].displayinfo();
        }
    }
}
