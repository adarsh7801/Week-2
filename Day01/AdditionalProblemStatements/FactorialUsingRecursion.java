import java.util.Scanner;

public class FactorialUsingRecursion {

    // Function to take input from the user
    public static int takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        return sc.nextInt();
    }

    // Recursive function to calculate factorial
    public static int calculateFactorial(int number) {
        // Base case: factorial of 0 or 1 is 1
        if (number == 0 || number == 1) {
            return 1;
        }
        // Recursive case: number * factorial of (number - 1)
        return number * calculateFactorial(number - 1);
    }

    // Function to display the result
    public static void displayResult(int result) {
        System.out.println("The factorial is: " + result);
    }

    // Main function
    public static void main(String[] args) {
        int number = takeInput();  // Take input from the user
        int result = calculateFactorial(number); // Calculate factorial using recursion
        displayResult(result);  // Display the result
    }
}
