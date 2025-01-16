import java.util.Scanner;

public class NumberGuessingGame {

    // Method to generate a random guess between the current range
    public static int generateGuess(int low, int high) {
        return low + (int) (Math.random() * (high - low + 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Think of a number between 1 and 100. The computer will try to guess it!");
        System.out.println("Provide feedback: 'high', 'low', or 'correct'.\n");

        int low = 1;
        int high = 100;
        int guess;

        while (true) {
            // Generate a random guess
            guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "?");
            System.out.print("Enter feedback ('high', 'low', or 'correct'): ");
            String feedback = sc.nextLine().trim().toLowerCase();

            // Process feedback
            if (feedback.equals("high")) {
                high = guess - 1; // Adjust range to lower
            } else if (feedback.equals("low")) {
                low = guess + 1; // Adjust range to higher
            } else if (feedback.equals("correct")) {
                System.out.println("Hurray! The computer guessed your number: " + guess);
                break;
            } else {
                System.out.println("Invalid feedback. Please enter 'high', 'low', or 'correct'.");
            }

            // Check if the range is invalid
            if (low > high) {
                System.out.println("It seems there's a mistake in the feedback. Please restart the game.");
                break;
            }
        }

        sc.close();
    }
}
