package Employees;

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee1 = new Employee("E12345", "Engineering", 75000.00);

        // Display employee details using the public method
        System.out.println("Employee 1 Details:");
        employee1.displayEmployeeDetails();

        // Modify salary using public setter method
        employee1.setSalary(80000.00);
        System.out.println("\nEmployee 1 Details After Salary Update:");
        employee1.displayEmployeeDetails();

        // Create a Manager object
        Manager manager = new Manager("M98765", "Management", 120000.00);

        // Display Manager details
        System.out.println("\nManager Details:");
        manager.displayManagerDetails();
    }
}
