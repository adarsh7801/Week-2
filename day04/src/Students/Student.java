package Students;

// Parent class: Student
public class Student {
    // Instance variables
    public int rollNumber;  // public: can be accessed from anywhere
    protected String name;  // protected: can be accessed within the same package or by subclasses
    private double CGPA;    // private: can only be accessed within this class

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access CGPA (getter)
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify CGPA (setter)
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass: PostgraduateStudent
class PostgraduateStudent extends Student {

    // Constructor for PostgraduateStudent
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);  // Call the parent class constructor
    }

    // Method to display Postgraduate student details (demonstrating the use of protected members)
    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber); // Can access public variable from parent class
        System.out.println("Name: " + name);  // Can access protected variable from parent class
        System.out.println("CGPA: " + getCGPA());  // Access private CGPA through the public getter
    }
}

