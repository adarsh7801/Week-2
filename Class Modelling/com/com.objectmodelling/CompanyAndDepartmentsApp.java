package com.com.objectmodelling;


import java.util.ArrayList;
import java.util.List;


// Employee Class
class Employee {
    private String name;


    // Constructor
    public Employee(String name) {
        this.name = name;
    }


    // Getter
    public String getName() {
        return name;
    }
}


// Department Class
class Department {
    private String name;
    private List<Employee> employees;


    // Constructor
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }


    // Getter for name
    public String getName() {
        return name;
    }


    // Add an Employee to the Department
    public void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }


    // Display Employees in the Department
    public void displayEmployees() {
        System.out.println("  Department: " + name);
        if (employees.isEmpty()) {
            System.out.println("    No employees in this department.");
        } else {
            for (Employee employee : employees) {
                System.out.println("    - " + employee.getName());
            }
        }
    }
}


// Company Class
class Company {
    private String companyName;
    private List<Department> departments;


    // Constructor
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }


    // Add a Department to the Company
    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }


    // Add an Employee to a Specific Department
    public void addEmployeeToDepartment(String departmentName, String employeeName) {
        for (Department department : departments) {
            if (departmentName.equals(department.getName())) { // Accessing name using getter
                department.addEmployee(employeeName);
                return;
            }
        }
        System.out.println("Department " + departmentName + " not found.");
    }


    // Display all Departments and Employees
    public void displayCompanyDetails() {
        System.out.println("Company: " + companyName);
        if (departments.isEmpty()) {
            System.out.println("No departments available.");
        } else {
            for (Department department : departments) {
                department.displayEmployees();
            }
        }
    }
}


// Main Class to Demonstrate Composition
public class CompanyAndDepartmentsApp {
    public static void main(String[] args) {
        // Create a Company
        Company company = new Company("TechCorp");


        // Add Departments to the Company
        company.addDepartment("Human Resources");
        company.addDepartment("Engineering");
        company.addDepartment("Marketing");


        // Add Employees to Departments
        company.addEmployeeToDepartment("Human Resources", "Alice");
        company.addEmployeeToDepartment("Engineering", "Bob");
        company.addEmployeeToDepartment("Engineering", "Charlie");
        company.addEmployeeToDepartment("Marketing", "David");


        // Display Company Details
        company.displayCompanyDetails();


        // Simulating deletion of the company (handled by garbage collection in Java)
        company = null;
        System.out.println("\nCompany deleted, and all departments and employees removed.");
    }
}
