import java.util.Scanner;

public class MaxOfThree {

    // Function to take input from the user
    public static int takeInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        int number = sc.nextInt();
        return number;
    }

    // Function to calculate the maximum of three numbers
    public static int findMaximum(int num1, int num2, int num3) {
        int max = num1; // Assume num1 is the maximum
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }

    // Main function
    public static void main(String[] args) {
        // Take three inputs from the user
        int num1 = takeInput("Enter the first number: ");
        int num2 = takeInput("Enter the second number: ");
        int num3 = takeInput("Enter the third number: ");

        // Calculate the maximum
        int maximum = findMaximum(num1, num2, num3);

        // Display the result
        System.out.println("The maximum of the three numbers is: " + maximum);
    }
}
