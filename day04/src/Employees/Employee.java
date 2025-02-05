package Employees;

// Parent class: Employee
public class Employee {
    // Instance variables
    public String employeeID;  // public: can be accessed from anywhere
    protected String department; // protected: can be accessed within the same package or by subclasses
    private double salary;  // private: can only be accessed within this class

    // Constructor
    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to get the salary (getter)
    public double getSalary() {
        return salary;
    }

    // Public method to modify the salary (setter)
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}
