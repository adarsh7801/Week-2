public class Employee {
    // Static variable shared by all employees
    private static String companyName = "TechCorp";
    private static int totalEmployees = 0; // Tracks the total number of employees

    // Final variable for the employee ID
    private final int id;

    // Instance variables
    private String name;
    private String designation;

    // Constructor to initialize employee details
    public Employee(String name, int id, String designation) {
        this.name = name; // Using 'this' to resolve ambiguity
        this.id = id; // Final variable initialized here
        this.designation = designation; // Using 'this' for clarity
        totalEmployees++; // Increment total employees whenever a new employee is created
    }

    // Static method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        if (this instanceof Employee) { // Check if the object is an instance of Employee
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Invalid employee object.");
        }
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        // Display company name and total employees using static methods
        System.out.println("Company: " + companyName);
        Employee.displayTotalEmployees();
        System.out.println();

        // Create employee objects
        Employee emp1 = new Employee("Alice", 101, "Software Engineer");
        Employee emp2 = new Employee("Bob", 102, "Data Scientist");

        // Display employee details
        emp1.displayEmployeeDetails();
        System.out.println();

        emp2.displayEmployeeDetails();
        System.out.println();

        // Verify instance using instanceof
        System.out.println("emp1 is an instance of Employee: " + (emp1 instanceof Employee));
        System.out.println("emp2 is an instance of Employee: " + (emp2 instanceof Employee));
        System.out.println();

        // Display total employees again
        Employee.displayTotalEmployees();
    }
}
