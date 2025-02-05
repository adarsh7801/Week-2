public class Product {
    // Static variable shared across all products
    private static double discount = 10.0; // Default discount in percentage

    // Final variable for the product ID
    private final int productID;

    // Instance variables
    private String productName;
    private double price;
    private int quantity;

    // Constructor to initialize product details
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID; // Final variable initialized here
        this.productName = productName; // Using 'this' to resolve ambiguity
        this.price = price; // Using 'this' for clarity
        this.quantity = quantity; // Using 'this' for clarity
    }

    // Static method to update the discount percentage
    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0 && newDiscount <= 100) {
            discount = newDiscount;
            System.out.println("Discount updated to: " + discount + "%");
        } else {
            System.out.println("Invalid discount value. Please provide a value between 0 and 100.");
        }
    }

    // Method to calculate the total price after discount
    public double calculateTotalPrice() {
        double totalPrice = price * quantity;
        double discountAmount = (totalPrice * discount) / 100;
        return totalPrice - discountAmount;
    }

    // Method to display product details
    public void displayProductDetails() {
        if (this instanceof Product) { // Check if the object is an instance of the Product class
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Total Price (after discount): $" + calculateTotalPrice());
        } else {
            System.out.println("Invalid product object.");
        }
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        // Update the discount using the static method
        Product.updateDiscount(15.0);
        System.out.println();

        // Create product objects
        Product product1 = new Product(101, "Laptop", 800.0, 1);
        Product product2 = new Product(102, "Smartphone", 500.0, 2);

        // Display product details
        product1.displayProductDetails();
        System.out.println();

        product2.displayProductDetails();
        System.out.println();

        // Verify instance using instanceof
        System.out.println("product1 is an instance of Product: " + (product1 instanceof Product));
        System.out.println("product2 is an instance of Product: " + (product2 instanceof Product));
    }
}
