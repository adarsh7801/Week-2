public class Person {
    // Attributes
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person otherPerson) {
        this.name = otherPerson.name;
        this.age = otherPerson.age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to display person details
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating a person using parameterized constructor
        Person originalPerson = new Person("Alice", 25);
        System.out.println("Original Person:");
        originalPerson.displayPersonDetails();

        // Cloning the original person using the copy constructor
        Person clonedPerson = new Person(originalPerson);
        System.out.println("\nCloned Person:");
        clonedPerson.displayPersonDetails();

        // Modifying the cloned person's details
        clonedPerson.setName("Bob");
        clonedPerson.setAge(30);

        // Displaying modified cloned person details
        System.out.println("\nModified Cloned Person:");
        clonedPerson.displayPersonDetails();

        // Displaying original person to ensure it's unchanged
        System.out.println("\nOriginal Person (Unchanged):");
        originalPerson.displayPersonDetails();
    }
}
