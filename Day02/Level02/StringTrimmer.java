import java.util.Scanner;

public class StringTrimmer {

    // Method to find the start and end points of the string
    public static int[] findTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Find the first non-space character
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Find the last non-space character
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring from a string
    public static String createSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Method to compare two strings
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.println("Enter a string");
        String input = sc.nextLine();

        int[] indices = findTrimIndices(input);
        String trimmedCustom = createSubstring(input, indices[0], indices[1]);

        String trimmedBuiltIn = input.trim();

        // Compare the results
        boolean isEqual = compareStrings(trimmedCustom, trimmedBuiltIn);

        // Display the results
        System.out.println("Custom Trimmed String: '" + trimmedCustom + "'");
        System.out.println("Built-in Trimmed String: '" + trimmedBuiltIn + "'");
        System.out.println("Are both trimmed strings equal? " + isEqual);

        sc.close();
    }
}
