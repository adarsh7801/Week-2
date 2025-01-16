import java.util.Random;

public class VotingEligibility {

    // Method to generate random ages for n students
    public static int[] generateAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(100);
        }

        return ages;
    }

    // Method to check voting eligibility and return a 2D array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]); // Store the age

            // Check for valid age and voting eligibility
            if (ages[i] < 0) {
                result[i][1] = "Cannot Vote (Invalid Age)";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void display2DArray(String[][] array) {
        System.out.println("Age        Eligibility");
        
        for (String[] row : array) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        int numberOfStudents = 10; // Define the number of students

        // Generate random ages
        int[] ages = generateAges(numberOfStudents);

        // Check voting eligibility
        String[][] eligibility = checkVotingEligibility(ages);

        // Display the results
        display2DArray(eligibility);
    }
}
