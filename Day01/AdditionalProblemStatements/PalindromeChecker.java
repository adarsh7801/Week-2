import java.util.Scanner;

public class PalindromeChecker {

    // Function to take input from the user
    public static String takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        return sc.nextLine();
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Removing spaces and converting to lowercase to handle phrases and case sensitivity
        str = str.replaceAll("\\s", "").toLowerCase();

        int left = 0, right = str.length() - 1;

        // Compare characters from both ends
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // Is a palindrome
    }

    // Function to display the result
    public static void displayResult(boolean result) {
        if (result) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    // Main function
    public static void main(String[] args) {
        String input = takeInput();  // Take input from the user
        boolean result = isPalindrome(input); // Check if the string is a palindrome
        displayResult(result);  // Display the result
    }
}
