import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Shopping Cart Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Cart");
            System.out.println("4. Display Total Cost");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Add item
                    System.out.print("Enter item name: ");
                    String itemName = sc.nextLine();
                    System.out.print("Enter item price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter item quantity: ");
                    int quantity = sc.nextInt();
                    cart.addItem(itemName, price, quantity);
                    break;

                case 2: // Remove item
                    cart.removeItem();
                    break;

                case 3: // Display cart
                    cart.displayCart();
                    break;

                case 4: // Display total cost
                    cart.displayTotalCost();
                    break;

                case 5: // Exit
                    System.out.println("Thank you for using the Shopping Cart system!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
