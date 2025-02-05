package com.schoolsystem;

// Main class to test the school system hierarchy
public class Main {

    public static void main(String[] args) {
        // Create an instance of Teacher with specific details
        Teacher teacher = new Teacher("Alice", 35, "Mathematics");

        // Create an instance of Student with specific details
        Student student = new Student("Bob", 15, "10th Grade");

        // Create an instance of Staff with specific details
        Staff staff = new Staff("Charlie", 40, "Administration");

        // Display details of the teacher
        System.out.println("=== Teacher Details ===");
        teacher.displayRole();

        // Display details of the student
        System.out.println("\n=== Student Details ===");
        student.displayRole();

        // Display details of the staff member
        System.out.println("\n=== Staff Details ===");
        staff.displayRole();
    }
}
