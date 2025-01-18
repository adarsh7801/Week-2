import java.util.Scanner;

public class StringToTwoDArray {

    // Creating the method to find the length of the string using a loop
    public static int length(String str) {
        int i = 0;

        // Handling the exception using try and catch
        try {
            while (true) {
                str.charAt(i);
                i++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string reached
        }
        return i;
    }

    // Method to split the string into words
    public static String[] stringToArray(String str) {
        int len = length(str);
        String temp = "";
        int wordCount = 0;

        // Count the number of words
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                if (!temp.isEmpty()) {
                    wordCount++;
                }
                temp = "";
            } else {
                temp += str.charAt(i);
            }
        }
        if (!temp.isEmpty()) {
            wordCount++;
        }

        String[] words = new String[wordCount];
        temp = "";
        int index = 0;

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                if (!temp.isEmpty()) {
                    words[index++] = temp;
                }
                temp = "";
            } else {
                temp += str.charAt(i);
            }
        }
        if (!temp.isEmpty()) {
            words[index] = temp;
        }
        return words;
    }

    // Method to find the shortest and longest strings
    public static String[] findShortestAndLongest(String[] words) {
        String shortest = words[0];
        String longest = words[0];

        for (String word : words) {
            if (length(word) < length(shortest)) {
                shortest = word;
            }
            if (length(word) > length(longest)) {
                longest = word;
            }
        }

        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String input = sc.nextLine();

        String[] words = stringToArray(input);
        String[] result = findShortestAndLongest(words);

        System.out.println("Shortest Word: " + result[0]);
        System.out.println("Longest Word: " + result[1]);

        sc.close();
    }
}
