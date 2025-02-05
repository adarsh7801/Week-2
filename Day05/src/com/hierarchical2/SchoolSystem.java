package com.hierarchical2;

//main class
public class SchoolSystem {
    public static void main(String[] args) {
        // Teacher object
        Teacher teacher = new Teacher("Alice Johnson", 35, "Mathematics");
        System.out.println("Teacher Details:");
        teacher.displayRole();
        teacher.displayDetails();

        System.out.println("\n-----------------------\n");

        // Student object
        Student student = new Student("John Doe", 16, "10th Grade");
        System.out.println("Student Details:");
        student.displayRole();
        student.displayDetails();

        System.out.println("\n-----------------------\n");

        // Staff object
        Staff staff = new Staff("Mary Smith", 40, "Administration");
        System.out.println("Staff Details:");
        staff.displayRole();
        staff.displayDetails();
    }
}
