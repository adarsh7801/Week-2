public class Patient {
    // Static variable shared by all patients
    private static String hospitalName = "Global Health Hospital";
    private static int totalPatients = 0; // Tracks the total number of admitted patients

    // Final variable for the patient's unique ID
    private final int patientID;

    // Instance variables
    private String name;
    private int age;
    private String ailment;

    // Constructor to initialize patient details
    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name; // Using 'this' to resolve ambiguity
        this.age = age; // Using 'this' for clarity
        this.ailment = ailment; // Using 'this' for clarity
        this.patientID = patientID; // Final variable initialized here
        totalPatients++; // Increment total patients whenever a new patient is admitted
    }

    // Static method to get the total number of patients
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    // Method to display patient details
    public void displayPatientDetails() {
        if (this instanceof Patient) { // Check if the object is an instance of Patient
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Invalid patient object.");
        }
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        // Display hospital name and total patients
        System.out.println("Hospital: " + hospitalName);
        Patient.getTotalPatients();
        System.out.println();

        // Create patient objects
        Patient patient1 = new Patient("Alice", 30, "Flu", 101);
        Patient patient2 = new Patient("Bob", 45, "Fracture", 102);

        // Display patient details
        patient1.displayPatientDetails();
        System.out.println();

        patient2.displayPatientDetails();
        System.out.println();

        // Verify instance using instanceof
        System.out.println("patient1 is an instance of Patient: " + (patient1 instanceof Patient));
        System.out.println("patient2 is an instance of Patient: " + (patient2 instanceof Patient));
        System.out.println();

        // Display total patients again
        Patient.getTotalPatients();
    }
}
