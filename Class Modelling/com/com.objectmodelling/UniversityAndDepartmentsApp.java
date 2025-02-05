package com.com.objectmodelling;

import java.util.ArrayList;
import java.util.List;

// Faculty Class
class Faculty {
    private String name;

    // Constructor
    public Faculty(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }
}

// Department Class (Composition with University)
class UniversityDepartment {
    private String name;
    private List<Faculty> facultyMembers;

    // Constructor
    public UniversityDepartment(String name) {
        this.name = name;
        this.facultyMembers = new ArrayList<>();
    }

    // Getter for department name
    public String getName() {
        return name;
    }

    // Add a Faculty to the Department
    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    // Display Faculty members in the Department
    public void displayFacultyMembers() {
        System.out.println("Department: " + name);
        if (facultyMembers.isEmpty()) {
            System.out.println("  No faculty members in this department.");
        } else {
            for (Faculty faculty : facultyMembers) {
                System.out.println("  - " + faculty.getName());
            }
        }
    }
}

// University Class (Composition with Department, Aggregation with Faculty)
class University {
    private String name;
    private List<UniversityDepartment> departments;

    // Constructor
    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Getter for University name
    public String getName() {
        return name;
    }

    // Add a Department to the University (Composition relationship)
    public void addDepartment(UniversityDepartment department) {
        departments.add(department);
    }

    // Display all Departments in the University
    public void displayUniversityDetails() {
        System.out.println("University: " + name);
        if (departments.isEmpty()) {
            System.out.println("  No departments in this university.");
        } else {
            for (UniversityDepartment department : departments) {
                department.displayFacultyMembers();
            }
        }
    }

    // Simulating deletion of the University (this will remove all departments)
    public void deleteUniversity() {
        departments.clear();
        System.out.println("The university and all its departments have been deleted.");
    }
}

// Main Class to Demonstrate Composition and Aggregation
public class UniversityAndDepartmentsApp {
    public static void main(String[] args) {
        // Create a University
        University university = new University("Tech University");

        // Create Departments
        UniversityDepartment computerScience = new UniversityDepartment("Computer Science");
        UniversityDepartment electricalEngineering = new UniversityDepartment("Electrical Engineering");

        // Add Departments to the University (Composition relationship)
        university.addDepartment(computerScience);
        university.addDepartment(electricalEngineering);

        // Create Faculty Members
        Faculty alice = new Faculty("Alice");
        Faculty bob = new Faculty("Bob");
        Faculty charlie = new Faculty("Charlie");

        // Add Faculty to the Departments (Aggregation relationship)
        computerScience.addFaculty(alice);
        computerScience.addFaculty(bob);
        electricalEngineering.addFaculty(charlie);

        // Display University Details (Composition and Aggregation)
        university.displayUniversityDetails();

        // Simulating deletion of the University (also deletes Departments)
        university.deleteUniversity();

        // Display details after deletion of the University
        university.displayUniversityDetails();  // Should show that all departments are deleted
    }
}
