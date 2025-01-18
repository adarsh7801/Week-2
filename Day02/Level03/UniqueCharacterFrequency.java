import java.util.Scanner;

public class UniqueCharacterFrequency {

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        StringBuilder uniqueChars = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (uniqueChars.indexOf(String.valueOf(currentChar)) == -1) {
                uniqueChars.append(currentChar);
            }
        }

        return uniqueChars.toString().toCharArray();
    }

    // Method to find the frequency of unique characters in a string
    public static String[][] findCharFrequencies(String text) {
        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // Create a 2D array to store unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char currentChar = uniqueChars[i];
            int frequency = 0;

            // Count the frequency of the current character
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == currentChar) {
                    frequency++;
                }
            }

            // Store the character and its frequency
            result[i][0] = String.valueOf(currentChar);
            result[i][1] = String.valueOf(frequency);
        }

        return result;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method to find unique character frequencies
        String[][] frequencies = findCharFrequencies(input);

        // Display the result
        System.out.println("Unique Character Frequencies:");
        for (String[] freq : frequencies) {
            System.out.println(freq[0] + ": " + freq[1]);
        }

        // Close the scanner
        scanner.close();
    }
}
