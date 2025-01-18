import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and BMI status
    public static String[][] calculateBMI(double[][] heightWeight) {
        int numPersons = heightWeight.length;
        String[][] bmiStatus = new String[numPersons][4];

        for (int i = 0; i < numPersons; i++) {
            double weight = heightWeight[i][0];
            double heightInMeters = heightWeight[i][1] / 100;
            double bmi = weight / (heightInMeters * heightInMeters);
            bmi = Math.round(bmi * 100.0) / 100.0;

            String status;
            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi <= 24.9) {
                status = "Normal";
            } else if (bmi <= 29.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            // Store the results in the 2D String array
            bmiStatus[i][0] = String.valueOf(heightWeight[i][0]);
            bmiStatus[i][1] = String.valueOf(heightWeight[i][1]);
            bmiStatus[i][2] = String.valueOf(bmi);
            bmiStatus[i][3] = status;
        }

        return bmiStatus;
    }

    // Method to display the BMI details in a tabular format
    public static void displayBMI(String[][] bmiDetails) {
        System.out.println("Person    Weight(kg)    Height(cm)    BMI    Status");

        for (int i = 0; i < bmiDetails.length; i++) {
            System.out.println((i + 1) + "    " + bmiDetails[i][0] + "    " +
                    bmiDetails[i][1] + "    " + bmiDetails[i][2] + "    " + bmiDetails[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPersons = 10;
        double[][] heightWeight = new double[numPersons][2];

        // Take input for weight and height for each person
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            heightWeight[i][0] = scanner.nextDouble();

            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            heightWeight[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and status
        String[][] bmiDetails = calculateBMI(heightWeight);

        displayBMI(bmiDetails);

        scanner.close();
    }
}
