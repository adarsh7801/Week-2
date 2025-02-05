package com.com.objectmodelling;

import java.util.ArrayList;
import java.util.List;

// UniversityCourse Class (Aggregation with UniversityProfessor and UniversityStudent)
class UniversityCourse {
    private String courseName;
    private List<UniversityStudent> students;
    private UniversityProfessor professor;

    // Constructor
    public UniversityCourse(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Getter for courseName
    public String getCourseName() {
        return courseName;
    }

    // Method to assign professor to the course
    public void assignProfessor(UniversityProfessor professor) {
        this.professor = professor;
        System.out.println(professor.getName() + " is now assigned to the course: " + courseName);
    }

    // Method to enroll a student in the course
    public void enrollStudent(UniversityStudent student) {
        students.add(student);
        System.out.println(student.getName() + " has enrolled in " + courseName);
    }

    // Display course details
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Taught by: " + professor.getName());
        }
        System.out.println("Enrolled Students:");
        if (students.isEmpty()) {
            System.out.println("  No students enrolled.");
        } else {
            for (UniversityStudent student : students) {
                System.out.println("  - " + student.getName());
            }
        }
    }
}

// UniversityProfessor Class
class UniversityProfessor {
    private String name;

    // Constructor
    public UniversityProfessor(String name) {
        this.name = name;
    }

    // Getter for professor name
    public String getName() {
        return name;
    }
}

// UniversityStudent Class
class UniversityStudent {
    private String name;

    // Constructor
    public UniversityStudent(String name) {
        this.name = name;
    }

    // Getter for student name
    public String getName() {
        return name;
    }

    // Method for student to enroll in a course
    public void enrollCourse(UniversityCourse course) {
        course.enrollStudent(this);
    }
}

// Main Class to Demonstrate the University System
public class UniversitySystemApp {
    public static void main(String[] args) {
        // Create Professors
        UniversityProfessor professor1 = new UniversityProfessor("Dr. Smith");
        UniversityProfessor professor2 = new UniversityProfessor("Dr. Johnson");

        // Create Courses
        UniversityCourse javaCourse = new UniversityCourse("Java Programming");
        UniversityCourse databaseCourse = new UniversityCourse("Database Management");

        // Assign Professors to Courses
        javaCourse.assignProfessor(professor1);
        databaseCourse.assignProfessor(professor2);

        // Create Students
        UniversityStudent student1 = new UniversityStudent("Alice");
        UniversityStudent student2 = new UniversityStudent("Bob");

        // Enroll Students in Courses
        student1.enrollCourse(javaCourse);
        student2.enrollCourse(javaCourse);
        student2.enrollCourse(databaseCourse);

        // Display course details
        javaCourse.displayCourseDetails();
        databaseCourse.displayCourseDetails();
    }
}
