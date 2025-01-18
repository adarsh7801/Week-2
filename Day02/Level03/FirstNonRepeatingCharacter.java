import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeatingChar(String text) {
        // Array to store the frequency of characters (size 256 for all ASCII characters)
        int[] charFrequency = new int[256];

        // Loop through the text to calculate the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            charFrequency[currentChar]++;
        }

        // Loop through the text again to find the first character with a frequency of 1
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (charFrequency[currentChar] == 1) {
                return currentChar; // Return the first non-repeating character
            }
        }

        // If no non-repeating character is found, return a placeholder (e.g., space or '-')
        return '-';
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method to find the first non-repeating character
        char result = findFirstNonRepeatingChar(input);

        // Display the result
        if (result != '-') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }

        // Close the scanner
        scanner.close();
    }
}
