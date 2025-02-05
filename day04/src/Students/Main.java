package Students;

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student(101, "John Doe", 8.5);

        // Display student details using the public method
        System.out.println("Student 1 Details:");
        student1.displayStudentDetails();

        // Modify CGPA using public setter method
        student1.setCGPA(9.0);
        System.out.println("\nStudent 1 Details After CGPA Update:");
        student1.displayStudentDetails();

        // Create a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Alice Smith", 9.2);

        // Display Postgraduate student details
        System.out.println("\nPostgraduate Student Details:");
        pgStudent.displayPostgraduateDetails();
    }
}
