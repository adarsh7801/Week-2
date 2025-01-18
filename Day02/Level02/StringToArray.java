import java.util.Scanner;

public class StringToArray {

    // Creating method to find the length of the string
    public static int length(String str) {
        int i = 0;
        try {
            while (true) {
                str.charAt(i);
                i++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return i;
        }
    }

    // Creating method to make array
    public static String[] toArray(String str, int i) {
        String[] str2 = new String[i];

        for (int j = 0; j < i; j++) {
            str2[j] = String.valueOf(str.charAt(j));
        }

        return str2;
    }

    // Checking if both are equal
    public static boolean comparison(String[] characters, String str) {
        String[] ch = str.split("");

        if (characters.length != ch.length) {
            return false;
        }

        for (int i = 0; i < characters.length; i++) {
            if (!characters[i].equals(ch[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str = sc.nextLine();

        int i = length(str);
        System.out.println("The length is " + i);

        String[] characters = toArray(str, i);

        System.out.println("Comparison result: " + comparison(characters, str));

        sc.close();
    }
}
