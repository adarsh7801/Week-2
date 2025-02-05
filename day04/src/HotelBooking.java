public class HotelBooking {
    // Attributes
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Unknown Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking otherBooking) {
        this.guestName = otherBooking.guestName;
        this.roomType = otherBooking.roomType;
        this.nights = otherBooking.nights;
    }

    // Getters and Setters
    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    // Method to display booking details
    public void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Using default constructor
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking:");
        defaultBooking.displayBookingDetails();

        // Using parameterized constructor
        HotelBooking parameterizedBooking = new HotelBooking("John Doe", "Deluxe", 3);
        System.out.println("\nParameterized Booking:");
        parameterizedBooking.displayBookingDetails();

        // Using copy constructor
        HotelBooking copiedBooking = new HotelBooking(parameterizedBooking);
        System.out.println("\nCopied Booking:");
        copiedBooking.displayBookingDetails();

        // Modifying copied booking details
        copiedBooking.setGuestName("Jane Smith");
        copiedBooking.setRoomType("Suite");
        copiedBooking.setNights(5);
        System.out.println("\nModified Copied Booking:");
        copiedBooking.displayBookingDetails();

        // Original booking remains unchanged
        System.out.println("\nOriginal Booking (Unchanged):");
        parameterizedBooking.displayBookingDetails();
    }
}
