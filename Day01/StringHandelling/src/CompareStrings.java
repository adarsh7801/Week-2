import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter String 2: ");
        String str2 = scanner.nextLine();

        int comparison = str1.compareTo(str2);

        if (comparison < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.");
        } else if (comparison > 0) {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order.");
        } else {
            System.out.println("Both strings are equal.");
        }
    }
}
