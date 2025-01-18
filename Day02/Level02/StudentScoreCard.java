import java.util.Random;

public class StudentScoreCard {

    // Method to generate random 2-digit PCM scores for students
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 10 + random.nextInt(90);
            }
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateStatistics(int[][] scores) {
        int numStudents = scores.length;
        double[][] stats = new double[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return stats;
    }

    // Method to calculate grade based on percentage
    public static String[] calculateGrades(double[][] stats) {
        int numStudents = stats.length;
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            double percentage = stats[i][2];
            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "F";
            }
        }
        return grades;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("Student  Physics  Chemistry  Math  Total  Average  Percentage  Grade");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "     " + scores[i][0] + "     " + scores[i][1] + "     " + scores[i][2] + "     " +
                    (int) stats[i][0] + "     " + stats[i][1] + "     " + stats[i][2] + "     " + grades[i]);
        }
    }

    public static void main(String[] args) {
        int numStudents = 10;

        int[][] scores = generateScores(numStudents);

        double[][] stats = calculateStatistics(scores);

        String[] grades = calculateGrades(stats);

        // Display the scorecard
        displayScorecard(scores, stats, grades);
    }
}
