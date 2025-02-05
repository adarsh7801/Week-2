public class Vehicle {
    // Static variable shared by all vehicles
    private static double registrationFee = 500.0; // Default registration fee

    // Final variable for the vehicle's registration number
    private final String registrationNumber;

    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName; // Using 'this' to resolve ambiguity
        this.vehicleType = vehicleType; // Using 'this' for clarity
        this.registrationNumber = registrationNumber; // Final variable initialized here
    }

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        if (newFee > 0) {
            registrationFee = newFee;
            System.out.println("Registration fee updated to: $" + registrationFee);
        } else {
            System.out.println("Invalid registration fee. Please provide a positive value.");
        }
    }

    // Method to display vehicle details
    public void displayVehicleDetails() {
        if (this instanceof Vehicle) { // Check if the object is an instance of the Vehicle class
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        } else {
            System.out.println("Invalid vehicle object.");
        }
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        // Display the default registration fee
        System.out.println("Default Registration Fee: $" + registrationFee);
        System.out.println();

        // Update the registration fee using the static method
        Vehicle.updateRegistrationFee(600.0);
        System.out.println();

        // Create vehicle objects
        Vehicle vehicle1 = new Vehicle("Alice", "Car", "CAR123");
        Vehicle vehicle2 = new Vehicle("Bob", "Motorcycle", "MOTO456");

        // Display vehicle details
        vehicle1.displayVehicleDetails();
        System.out.println();

        vehicle2.displayVehicleDetails();
        System.out.println();

        // Verify instance using instanceof
        System.out.println("vehicle1 is an instance of Vehicle: " + (vehicle1 instanceof Vehicle));
        System.out.println("vehicle2 is an instance of Vehicle: " + (vehicle2 instanceof Vehicle));
    }
}
