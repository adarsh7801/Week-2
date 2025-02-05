package com;

public class VehicleManagementSystem {

    // Superclass Vehicle representing common attributes of all vehicles
    public static class Vehicle {
        String model;    // Common attribute for the model
        int maxSpeed;    // Common attribute for the maximum speed

        // Constructor to initialize model and maxSpeed
        public Vehicle(String model, int maxSpeed) {
            this.model = model;
            this.maxSpeed = maxSpeed;
        }

        // Method to display common details of a vehicle
        public void displayDetails() {
            System.out.println("Model: " + model);
            System.out.println("Max Speed: " + maxSpeed + " km/h");
        }
    }

    // Interface Refuelable to define the behavior of refueling
    public interface Refuelable {
        void refuel(); // Abstract method to refuel the vehicle
    }

    // Subclass ElectricVehicle representing electric vehicles
    public static class ElectricVehicle extends Vehicle {
        int batteryCapacity; // Attribute for the battery capacity in kWh

        // Constructor to initialize model, maxSpeed, and batteryCapacity
        public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
            super(model, maxSpeed); // Call the superclass constructor
            this.batteryCapacity = batteryCapacity;
        }

        // Method to charge the electric vehicle
        public void charge() {
            System.out.println("Charging the electric vehicle with " + batteryCapacity + " kWh battery capacity.");
        }

        // Override displayDetails to add electric vehicle-specific details
        @Override
        public void displayDetails() {
            super.displayDetails(); // Call the superclass method
            System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        }
    }

    // Subclass PetrolVehicle representing petrol vehicles
    public static class PetrolVehicle extends Vehicle implements Refuelable {
        int fuelTankCapacity; // Attribute for the fuel tank capacity in liters

        // Constructor to initialize model, maxSpeed, and fuelTankCapacity
        public PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
            super(model, maxSpeed); // Call the superclass constructor
            this.fuelTankCapacity = fuelTankCapacity;
        }

        // Implement the refuel method from Refuelable interface
        @Override
        public void refuel() {
            System.out.println("Refueling the petrol vehicle with " + fuelTankCapacity + " liters of fuel.");
        }

        // Override displayDetails to add petrol vehicle-specific details
        @Override
        public void displayDetails() {
            super.displayDetails(); // Call the superclass method
            System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
        }
    }

    // Main method to demonstrate the system
    public static void main(String[] args) {
        // Create an instance of ElectricVehicle
        ElectricVehicle electricVehicle = new ElectricVehicle("Tesla Model 3", 200, 75);
        System.out.println("=== Electric Vehicle Details ===");
        electricVehicle.displayDetails();
        electricVehicle.charge();

        // Create an instance of PetrolVehicle
        PetrolVehicle petrolVehicle = new PetrolVehicle("Toyota Corolla", 180, 50);
        System.out.println("\n=== Petrol Vehicle Details ===");
        petrolVehicle.displayDetails();
        petrolVehicle.refuel();
    }
}
