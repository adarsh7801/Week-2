// MovieTicket.java
public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor
    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false; // Initially, the ticket is not booked
    }

    // Method to book the ticket
    public void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("This ticket has already been booked.");
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("\n--- Ticket Details ---");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
        System.out.println("Booking Status: " + (isBooked ? "Booked" : "Available"));
    }
}
