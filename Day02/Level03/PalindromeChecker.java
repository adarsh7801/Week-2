import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Compare characters from the start and end of the string
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // Logic 2: Recursive method to check if text is palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Compare original and reversed arrays
    public static boolean isPalindromeUsingArrays(String text) {
        // Reverse the string using charAt()
        String reversed = reverseString(text);

        // Compare original and reversed strings
        return text.equals(reversed);
    }

    // Method to reverse a string using charAt()
    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a text: ");
        String input = scanner.nextLine();

        // Remove spaces and convert to lowercase for uniform comparison
        String processedInput = input.replaceAll("\\s+", "").toLowerCase();

        // Check palindrome using all three logics
        boolean isIterativePalindrome = isPalindromeIterative(processedInput);
        boolean isRecursivePalindrome = isPalindromeRecursive(processedInput, 0, processedInput.length() - 1);
        boolean isArrayPalindrome = isPalindromeUsingArrays(processedInput);

        // Display the results
        System.out.println("Palindrome check results:");
        System.out.println("Using Iterative Method: " + isIterativePalindrome);
        System.out.println("Using Recursive Method: " + isRecursivePalindrome);
        System.out.println("Using Arrays Method: " + isArrayPalindrome);

        // Close the scanner
        scanner.close();
    }
}
