import java.util.Scanner;

public class TemperatureConverter {

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Function to take input from the user
    public static double takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        return sc.nextDouble();
    }

    // Function to display the result
    public static void displayResult(String conversionType, double result) {
        System.out.println("Converted temperature (" + conversionType + "): " + result);
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking the user to choose the type of conversion
        System.out.println("Choose the conversion type:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter choice (1 or 2): ");
        int choice = sc.nextInt();

        double inputTemperature, resultTemperature;

        // Perform the conversion based on user choice
        if (choice == 1) {
            // Fahrenheit to Celsius
            inputTemperature = takeInput();
            resultTemperature = fahrenheitToCelsius(inputTemperature);
            displayResult("Fahrenheit to Celsius", resultTemperature);
        } else if (choice == 2) {
            // Celsius to Fahrenheit
            inputTemperature = takeInput();
            resultTemperature = celsiusToFahrenheit(inputTemperature);
            displayResult("Celsius to Fahrenheit", resultTemperature);
        } else {
            System.out.println("Invalid choice. Please choose 1 or 2.");
        }

        sc.close();
    }
}
