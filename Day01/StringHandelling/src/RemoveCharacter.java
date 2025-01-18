import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter character to remove: ");
        char toRemove = scanner.next().charAt(0);

        String result = input.replace(String.valueOf(toRemove), "");

        System.out.println("Modified String: " + result);
    }
}
