public class Student {
    // Static variable shared by all students
    private static String universityName = "Global University";
    private static int totalStudents = 0; // Tracks the total number of students

    // Final variable for the student's roll number
    private final int rollNumber;

    // Instance variables
    private String name;
    private String grade;

    // Constructor to initialize student details
    public Student(String name, int rollNumber, String grade) {
        this.name = name; // Using 'this' to resolve ambiguity
        this.rollNumber = rollNumber; // Final variable initialized here
        this.grade = grade; // Using 'this' for clarity
        totalStudents++; // Increment total students whenever a new student is added
    }

    // Static method to display total number of students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Method to update the grade of the student
    public void updateGrade(String newGrade) {
        if (this instanceof Student) { // Check if the object is an instance of Student
            this.grade = newGrade;
            System.out.println("Grade updated successfully for roll number: " + rollNumber);
        } else {
            System.out.println("Invalid student object. Cannot update grade.");
        }
    }

    // Method to display student details
    public void displayStudentDetails() {
        if (this instanceof Student) { // Check if the object is an instance of Student
            System.out.println("University Name: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid student object.");
        }
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        // Display university name and total students
        System.out.println("University: " + universityName);
        Student.displayTotalStudents();
        System.out.println();

        // Create student objects
        Student student1 = new Student("Alice", 101, "A");
        Student student2 = new Student("Bob", 102, "B");

        // Display student details
        student1.displayStudentDetails();
        System.out.println();

        student2.displayStudentDetails();
        System.out.println();

        // Update and display grades
        student2.updateGrade("A+");
        student2.displayStudentDetails();
        System.out.println();

        // Verify instance using instanceof
        System.out.println("student1 is an instance of Student: " + (student1 instanceof Student));
        System.out.println("student2 is an instance of Student: " + (student2 instanceof Student));
        System.out.println();

        // Display total students again
        Student.displayTotalStudents();
    }
}
