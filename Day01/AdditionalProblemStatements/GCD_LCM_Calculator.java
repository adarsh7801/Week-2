import java.util.Scanner;

public class GCD_LCM_Calculator {

    // Function to calculate the GCD of two numbers
    public static int calculateGCD(int num1, int num2) {
        // Using Euclidean algorithm to find GCD
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1; // num1 is the GCD
    }

    // Function to calculate the LCM of two numbers
    public static int calculateLCM(int num1, int num2) {
        // LCM formula: LCM(a, b) = |a * b| / GCD(a, b)
        int gcd = calculateGCD(num1, num2);
        return Math.abs(num1 * num2) / gcd; // Absolute value to handle negative inputs
    }

    // Function to take input from the user
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        return new int[] { num1, num2 };
    }

    // Function to display the results
    public static void displayResults(int gcd, int lcm) {
        System.out.println("The Greatest Common Divisor (GCD) is: " + gcd);
        System.out.println("The Least Common Multiple (LCM) is: " + lcm);
    }

    // Main function
    public static void main(String[] args) {
        // Taking user input
        int[] numbers = takeInput();
        int num1 = numbers[0];
        int num2 = numbers[1];

        // Calculating GCD and LCM
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2);

        // Displaying the results
        displayResults(gcd, lcm);
    }
}
