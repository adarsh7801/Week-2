package com.com.objectmodelling;

import java.util.ArrayList;
import java.util.List;

// Course Class
class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Getter for courseName
    public String getCourseName() {
        return courseName;
    }

    // Add a student to the course
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    // Display enrolled students
    public void displayEnrolledStudents() {
        System.out.println("Course: " + courseName);
        if (enrolledStudents.isEmpty()) {
            System.out.println("  No students enrolled.");
        } else {
            for (Student student : enrolledStudents) {
                System.out.println("  - " + student.getName());
            }
        }
    }
}

// Student Class
class Student {
    private String name;
    private List<Course> enrolledCourses;

    // Constructor
    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Enroll in a course
    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
        course.enrollStudent(this); // Ensure bidirectional relationship
    }

    // Display enrolled courses
    public void displayEnrolledCourses() {
        System.out.println("Student: " + name);
        if (enrolledCourses.isEmpty()) {
            System.out.println("  No courses enrolled.");
        } else {
            for (Course course : enrolledCourses) {
                System.out.println("  - " + course.getCourseName());
            }
        }
    }
}

// School Class
class School {
    private String schoolName;
    private List<Student> students;

    // Constructor
    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    // Add a student to the school
    public void addStudent(Student student) {
        students.add(student);
    }

    // Display all students in the school
    public void displayAllStudents() {
        System.out.println("School: " + schoolName);
        if (students.isEmpty()) {
            System.out.println("  No students in the school.");
        } else {
            for (Student student : students) {
                System.out.println("  - " + student.getName());
            }
        }
    }
}

// Main Class to Demonstrate Association and Aggregation
public class SchoolAndStudentsApp {
    public static void main(String[] args) {
        // Create a School
        School school = new School("Green Valley High");

        // Create Students
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        Student charlie = new Student("Charlie");

        // Add Students to the School
        school.addStudent(alice);
        school.addStudent(bob);
        school.addStudent(charlie);

        // Create Courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        Course history = new Course("History");

        // Students Enroll in Courses
        alice.enrollInCourse(math);
        alice.enrollInCourse(science);
        bob.enrollInCourse(science);
        charlie.enrollInCourse(history);

        // Display School Details
        school.displayAllStudents();

        // Display Courses for Each Student
        alice.displayEnrolledCourses();
        bob.displayEnrolledCourses();
        charlie.displayEnrolledCourses();

        // Display Enrolled Students for Each Course
        math.displayEnrolledStudents();
        science.displayEnrolledStudents();
        history.displayEnrolledStudents();
    }
}
