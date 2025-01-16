import java.util.Scanner;

public class BasicCalculator {

    // Function to add two numbers
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Function to subtract two numbers
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Function to multiply two numbers
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Function to divide two numbers
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Return NaN to indicate an error
        }
        return num1 / num2;
    }

    // Function to take user input
    public static double takeInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextDouble();
    }

    // Function to display the result
    public static void displayResult(String operation, double result) {
        System.out.println("Result of " + operation + ": " + result);
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Displaying the options for operations
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        // Taking the user's choice
        System.out.print("Enter the number corresponding to your choice: ");
        int choice = sc.nextInt();

        // Taking two numbers as input
        double num1 = takeInput("Enter the first number: ");
        double num2 = takeInput("Enter the second number: ");

        double result = 0; // Variable to store the result

        // Performing the operation based on user input
        switch (choice) {
            case 1:
                result = add(num1, num2);
                displayResult("Addition", result);
                break;
            case 2:
                result = subtract(num1, num2);
                displayResult("Subtraction", result);
                break;
            case 3:
                result = multiply(num1, num2);
                displayResult("Multiplication", result);
                break;
            case 4:
                result = divide(num1, num2);
                if (!Double.isNaN(result)) {
                    displayResult("Division", result);
                }
                break;
            default:
                System.out.println("Invalid choice! Please choose a number between 1 and 4.");
        }

        sc.close();
    }
}
