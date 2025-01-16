import java.util.Scanner;

// Main class to test the PalindromeChecker
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter a text to check if it's a palindrome:");
        String text = sc.nextLine();

        // Creating a PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker(text);

        // Displaying the result
        checker.displayResult();

        sc.close();
    }
}
