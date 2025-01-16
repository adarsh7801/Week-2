import java.util.Scanner;

public class CharacterFrequencyNestedLoops {

    // Method to find the frequency of characters in a string
    public static String[] findCharFrequencies(String text) {
        // Convert the string to a character array
        char[] characters = text.toCharArray();
        int[] frequencies = new int[characters.length];

        // Outer loop to iterate through each character in the text
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') { // Skip already counted characters
                frequencies[i] = 1; // Initialize frequency to 1

                // Inner loop to check for duplicate characters
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        frequencies[i]++;
                        characters[j] = '0'; // Mark duplicate characters as '0'
                    }
                }
            }
        }

        // Count the number of unique characters
        int uniqueCount = 0;
        for (char c : characters) {
            if (c != '0') {
                uniqueCount++;
            }
        }

        // Create a 1D String array to store the characters and their frequencies
        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                result[index] = characters[i] + ": " + frequencies[i];
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
        String[] frequencies = findCharFrequencies(input);

        // Display the result
        System.out.println("Character Frequencies:");
        for (String freq : frequencies) {
            System.out.println(freq);
        }

        // Close the scanner
        scanner.close();
    }
}
