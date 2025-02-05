public class Circle {
    // Attribute
    private double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Calls the parameterized constructor with a default value
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display circle details
    public void displayCircleDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    // Main method for testing
    public static void main(String[] args) {
        // Using default constructor
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle:");
        defaultCircle.displayCircleDetails();

        // Using parameterized constructor
        Circle customCircle = new Circle(5.0);
        System.out.println("\nCustom Circle:");
        customCircle.displayCircleDetails();
    }
}
