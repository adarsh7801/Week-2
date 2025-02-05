//package name
package com.vehiclerentalsystem;

public class Main {

    public static void main(String[] args) {

        //initializing variable
        String vehicleNumberCar = "UP93 AE0475";
        String vehicleTypeCar = "SUV";
        double rentalRateCar = 4000;
        int carDays = 7;

        String vehicleNumberBike = "MP04 UE2638";
        String vehicleTypeBike = "Activa";
        double rentalRateBike = 400;
        int bikeDays = 15;

        String vehicleNumberTruck = "MP04 AB7891";
        String vehicleTypeTruck = "Mahindra";
        double rentalRateTruck = 8000;
        int truckDays = 3;


        //creating object of car class
        Car car1 = new Car(vehicleNumberCar, vehicleTypeCar , rentalRateCar,carDays);
        System.out.println("The total rental rate of Car for "+carDays+" is "+car1.calculateRentalRate());
        System.out.println(car1.getInsuranceDetail());
        System.out.println(car1.calculateInsurance());
        System.out.println();


        //creating object of car class
        Bike bike1 = new Bike(vehicleNumberBike, vehicleTypeBike, rentalRateBike,bikeDays);
        System.out.println("The total rental rate of Bike "+bikeDays+" is "+bike1.calculateRentalRate());
        System.out.println(bike1.getInsuranceDetail());
        System.out.println(bike1.calculateInsurance());
        System.out.println();


        //creating object of car class
        Truck truck1 = new Truck(vehicleNumberTruck, vehicleTypeTruck, rentalRateTruck, truckDays);
        System.out.println("The total rental rate of truck "+truckDays+" is "+truck1.calculateRentalRate());
        System.out.println(truck1.getInsuranceDetail());
        System.out.println(truck1.calculateInsurance());

    }


}
