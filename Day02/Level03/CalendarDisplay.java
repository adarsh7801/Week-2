import java.util.Scanner;

public class CalendarDisplay {

    // Array to store the names of the months
    static final String[] months = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array to store the number of days in each month
    static final int[] daysInMonth = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in a given month and year
    public static int getDaysInMonth(int month, int year) {
        if (month == 1 && isLeapYear(year)) { // February in a leap year
            return 29;
        }
        return daysInMonth[month];
    }

    // Method to calculate the first day of the month using Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m) / 12) % 7; // 1 represents the first day of the month
    }

    // Method to display the calendar for a given month and year
    public static void displayCalendar(int month, int year) {
        System.out.println("\n " + months[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(month, year);
        int daysInCurrentMonth = getDaysInMonth(month, year);

        // Print leading spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInCurrentMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) { // Move to the next line after Saturday
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for month and year
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt() - 1; // Convert to 0-based index

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Validate inputs
        if (month < 0 || month > 11 || year < 1) {
            System.out.println("Invalid input. Please enter a valid month and year.");
        } else {
            displayCalendar(month, year);
        }

        scanner.close();
    }
}
