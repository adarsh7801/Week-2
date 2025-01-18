import java.util.Scanner;

public class ConsonentVowelOrNotALetter {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacter(char ch) {
        // Convert uppercase letters to lowercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if the character is a letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to find vowels and consonants in a string
    public static String[][] findVowelsAndConsonants(String str) {
        int len = str.length();
        String[][] result = new String[len][2];

        // Loop through the string character by character
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacter(ch);
        }

        return result;
    }

    // Method to display a 2D array in a tabular format
    public static void display2DArray(String[][] array) {
        System.out.println("Character               Type");
        for (String[] row : array) {
            System.out.println(row[0] + "               " + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Call the method to find vowels and consonants
        String[][] result = findVowelsAndConsonants(input);

        // Display the results in a tabular format
        display2DArray(result);

        sc.close();
    }
}
