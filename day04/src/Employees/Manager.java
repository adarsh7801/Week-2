package Employees;

// Subclass: Manager
class Manager extends Employee {

    // Constructor for Manager
    public Manager(String employeeID, String department, double salary) {
        super(employeeID, department, salary);  // Call the parent class constructor
    }

    // Method to display Manager details (demonstrating the use of access modifiers)
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID);  // Can access public variable from parent class
        System.out.println("Department: " + department);  // Can access protected variable from parent class
        System.out.println("Salary: $" + getSalary());  // Access private salary through the public getter
    }
}
