import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static int[][] findCharFrequencies(String text) {
        // Array to store the frequency of characters (size 256 for all ASCII characters)
        int[] charFrequency = new int[256];

        // Loop through the text to calculate the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            charFrequency[currentChar]++;
        }

        // Count distinct characters to create the 2D array
        int distinctCount = 0;
        for (int freq : charFrequency) {
            if (freq > 0) {
                distinctCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        int[][] result = new int[distinctCount][2];
        int index = 0;
        for (int i = 0; i < charFrequency.length; i++) {
            if (charFrequency[i] > 0) {
                result[index][0] = i; // ASCII value of the character
                result[index][1] = charFrequency[i]; // Frequency of the character
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method to find character frequencies
        int[][] frequencies = findCharFrequencies(input);

        // Display the result
        System.out.println("Character frequencies:");
        for (int[] freq : frequencies) {
            char character = (char) freq[0]; // Convert ASCII value back to character
            int count = freq[1];
            System.out.println(character + ": " + count);
        }

        // Close the scanner
        scanner.close();
    }
}
