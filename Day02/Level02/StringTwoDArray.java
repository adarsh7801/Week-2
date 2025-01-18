import java.util.Scanner;

public class StringTwoDArray {

    // Method to find the length of the string without using length() method
    public static int length(String str) {
        int i = 0;
        try {
            while (true) {
                str.charAt(i);
                i++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception indicates the end of the string
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

    // Method to create a 2D array with words and their lengths
    public static String[][] createWordLengthArray(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i];
            wordLengthArray[i][1] = String.valueOf(length(words[i]));
        }
        return wordLengthArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String input = sc.nextLine();

        String[] words = stringToArray(input);
        String[][] wordLengthArray = createWordLengthArray(words);

        System.out.println("Word\tLength");
        for (String[] row : wordLengthArray) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }

        sc.close();
    }
}
