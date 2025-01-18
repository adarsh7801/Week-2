import java.util.Scanner;

public class ShoppingCart {
    private CartItem cartItem; // Single item in the cart

    // Add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        if (cartItem == null) {
            cartItem = new CartItem(itemName, price, quantity);
            System.out.println(itemName + " added to the cart.");
        } else {
            System.out.println("An item is already in the cart. Remove it before adding another.");
        }
    }

    // Remove the current item from the cart
    public void removeItem() {
        if (cartItem != null) {
            System.out.println(cartItem.getItemName() + " removed from the cart.");
            cartItem = null;
        } else {
            System.out.println("The cart is already empty.");
        }
    }

    // Display the total cost of the item in the cart
    public void displayTotalCost() {
        if (cartItem != null) {
            System.out.println("Total cost: $" + cartItem.getTotalCost());
        } else {
            System.out.println("The cart is empty.");
        }
    }

    // Display the current item in the cart
    public void displayCart() {
        if (cartItem != null) {
            System.out.println("\n--- Cart Item ---");
            cartItem.displayItem();
        } else {
            System.out.println("The cart is empty.");
        }
    }
}
