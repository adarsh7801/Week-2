import java.util.Scanner;

public class SubstringComparison {

    // Method to create a substring using charAt
    public static String substringUsingCharAt(String str, int a, int b) {
        String str1 = "";
        for (int i = a; i < b; i++) {
            str1 += str.charAt(i);
        }
        return str1;
    }

    // Method to create a substring using substring method
    public static String substringUsingsubstring(String str, int a, int b) {
        return str.substring(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.println("Enter the string:");
        String str = sc.nextLine();

        System.out.println("Enter the starting index:");
        int a = sc.nextInt();

        System.out.println("Enter the ending index:");
        int b = sc.nextInt();
        
            // Generate substrings using both methods
            String sstr1 = substringUsingCharAt(str, a, b);
            String sstr2 = substringUsingsubstring(str, a, b);

            // Print the results
            System.out.println("Substring using charAt: " + sstr1);
            System.out.println("Substring using substring: " + sstr2);

            // Compare the substrings
            if (sstr1.equals(sstr2)) {
                System.out.println("The substrings are equal.");
            } else {
                System.out.println("The substrings are not equal.");
            }

		//closing the scanner
        sc.close();
    }
}
