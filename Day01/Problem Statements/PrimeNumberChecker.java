import java.util.Scanner;

public class PrimeNumberChecker {

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible by any number other than 1 and itself, not prime
            }
        }
        return true; // If no divisors found, it's prime
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number to check if it is prime: ");
        int number = sc.nextInt();

        // Check if the number is prime
        boolean result = isPrime(number);

        // Display the result
        if (result) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        sc.close();
    }
}
