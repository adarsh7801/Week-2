// CartItem.java
public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to calculate total cost for the item
    public double getTotalCost() {
        return price * quantity;
    }

    // Method to display item details
    public void displayItem() {
        System.out.println(itemName + " | Price: $" + price + " | Quantity: " + quantity + " | Total: $" + getTotalCost());
    }
}
