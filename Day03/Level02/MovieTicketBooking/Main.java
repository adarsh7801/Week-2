import java.util.Scanner;

// Main class to simulate the Movie Ticket Booking System
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input movie ticket details
        System.out.println("Enter the movie name:");
        String movieName = sc.nextLine();
        System.out.println("Enter the seat number:");
        String seatNumber = sc.nextLine();
        System.out.println("Enter the ticket price:");
        double price = sc.nextDouble();

        // Create a MovieTicket object
        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);

        // Menu-driven program
        while (true) {
            System.out.println("\n--- Movie Ticket Booking System ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Display Ticket Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Book Ticket
                    ticket.bookTicket();
                    break;
                case 2: // Display Ticket Details
                    ticket.displayTicketDetails();
                    break;
                case 3: // Exit
                    System.out.println("Thank you for using the Movie Ticket Booking System!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
