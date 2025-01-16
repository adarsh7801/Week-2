import java.util.Scanner;

public class TextConverter {

    // Method to convert a string to uppercase using charAt()
    public static String convertToUppercase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32)); // Convert lowercase to uppercase
            } else {
                result.append(ch); // Append as is if not lowercase
            }
        }
        return result.toString();
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // Strings are of different lengths
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // Mismatch found
            }
        }
        return true; // Strings are identical
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String userInput = scanner.nextLine();

        // Convert to uppercase using charAt() method
        String manualUppercase = convertToUppercase(userInput);

        // Convert to uppercase using built-in method
        String builtInUppercase = userInput.toUpperCase();

        // Compare the results using the user-defined method
        boolean areEqual = compareStrings(manualUppercase, builtInUppercase);

        // Display the results
        System.out.println("Original String: " + userInput);
        System.out.println("Manual Uppercase: " + manualUppercase);
        System.out.println("Built-in Uppercase: " + builtInUppercase);
        System.out.println("Are both methods giving the same result? " + areEqual);

        scanner.close();
    }
}
