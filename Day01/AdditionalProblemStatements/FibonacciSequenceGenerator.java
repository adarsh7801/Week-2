import java.util.Scanner;

public class FibonacciSequenceGenerator {

    // Function to generate and print the Fibonacci sequence up to a specified number of terms
    public static void generateFibonacci(int terms) {
        int first = 0, second = 1;

        // Special case for 1 term
        if (terms >= 1) {
            System.out.print("Fibonacci Sequence: " + first);
        }
        if (terms >= 2) {
            System.out.print(" " + second);
        }

        // Generate the sequence for terms greater than 2
        for (int i = 3; i <= terms; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }

        System.out.println(); // For a newline after the sequence
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of terms in the Fibonacci sequence
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int terms = sc.nextInt();

        // Generate and display the Fibonacci sequence
        generateFibonacci(terms);

        sc.close();
    }
}
