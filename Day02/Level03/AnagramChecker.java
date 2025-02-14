import java.util.Scanner;

public class AnagramChecker {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Remove spaces and convert to lowercase for uniform comparison
        text1 = text1.replaceAll("\\s+", "").toLowerCase();
        text2 = text2.replaceAll("\\s+", "").toLowerCase();

        // Check if lengths of the two texts are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create arrays to store the frequency of characters in the two texts
        int[] frequency1 = new int[256]; // For ASCII characters
        int[] frequency2 = new int[256];

        // Find the frequency of characters in the first text
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
        }

        // Find the frequency of characters in the second text
        for (int i = 0; i < text2.length(); i++) {
            frequency2[text2.charAt(i)]++;
        }

        // Compare the frequency of characters in the two texts
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first text
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();

        // Prompt the user to enter the second text
        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        // Call the method to check if the texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Display the result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        // Close the scanner
        scanner.close();
    }
}
