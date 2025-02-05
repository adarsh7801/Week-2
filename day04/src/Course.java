public class Course {
    // Instance variables
    private String courseName;
    private int duration; // in hours
    private double fee;

    // Class variable
    private static String instituteName = "Global Tech Academy";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Fee: $" + fee);
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
        System.out.println("Institute name updated to: " + instituteName);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create courses
        Course course1 = new Course("Java Programming", 40, 300.0);
        Course course2 = new Course("Python for Data Science", 50, 400.0);

        // Display course details
        System.out.println("Course 1 Details:");
        course1.displayCourseDetails();

        System.out.println("\nCourse 2 Details:");
        course2.displayCourseDetails();

        // Update the institute name
        System.out.println("\nUpdating Institute Name...");
        Course.updateInstituteName("Tech Learning Hub");

        // Display course details again to see the updated institute name
        System.out.println("\nCourse 1 Details After Update:");
        course1.displayCourseDetails();

        System.out.println("\nCourse 2 Details After Update:");
        course2.displayCourseDetails();
    }
}
