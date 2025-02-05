public class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Class variable
    private static double registrationFee = 100.0; // Default registration fee

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: $" + registrationFee);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create vehicle instances
        Vehicle vehicle1 = new Vehicle("Alice Johnson", "Car");
        Vehicle vehicle2 = new Vehicle("Bob Smith", "Motorcycle");

        // Display vehicle details
        System.out.println("Vehicle 1 Details:");
        vehicle1.displayVehicleDetails();

        System.out.println("\nVehicle 2 Details:");
        vehicle2.displayVehicleDetails();

        // Update the registration fee
        System.out.println("\nUpdating Registration Fee...");
        Vehicle.updateRegistrationFee(150.0);

        // Display vehicle details again to see the updated registration fee
        System.out.println("\nVehicle 1 Details After Update:");
        vehicle1.displayVehicleDetails();

        System.out.println("\nVehicle 2 Details After Update:");
        vehicle2.displayVehicleDetails();
    }
}
