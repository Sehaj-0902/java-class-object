import java.util.Scanner;

public class CartItem {
    // Class attributes
    private String itemName;
    private double price ;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    private CartItem[] cart = new CartItem[50];
    private int itemCount = 0;

    public void addItem(String itemName, double price, int quantity) {
        boolean itemFound = false;
        for (int i = 0; i < itemCount; i++) {
            if (cart[i].equals(itemName)) {
                quantity += quantity;
                System.out.println("Quantity of " + itemName + " updated.");
                itemFound = true;
                break;
            }
        }
        if (!itemFound) {
            if (itemCount < cart.length) {
                cart[itemCount] = new CartItem(itemName, price, quantity);
                itemCount++;
                System.out.println(itemName + " added to cart.");
            } else {
                System.out.println("Cart is full.");
            }
        }
    }

    public void removeItem(String removeItemName) {
        boolean itemFound = false;
        for (int i = 0; i < itemCount; i++) {
            if (cart[i].itemName.equals(removeItemName)) {
                for(int j = i; j < itemCount - 1; j++){
                    cart[j] = cart[j+1];
                }
                itemCount--;
                System.out.println(removeItemName + " removed from cart.");
                itemFound = true;
                break;
            }
        }
        if (!itemFound) {
            System.out.println(removeItemName + " not found in cart.");
        }
    }

    public void displayTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < itemCount; i++) {
            totalCost += cart[i].price * cart[i].quantity;
        }
        System.out.println("Total cost: " + totalCost);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Name: ");
        String itemName = sc.nextLine();

        System.out.print("Enter Item Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Item Quantity: ");
        int quantity = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter item name to remove: ");
        String removeItemName = sc.nextLine();

        CartItem item = new CartItem(itemName, price, quantity);
        // Calling addItem() method to add items to cart
        item.addItem(itemName, price, quantity);

        // Calling displayTotalCost() method to display total cost
        item.displayTotalCost();

        // Calling removeItem() method to remove item from cart
        item.removeItem(removeItemName);
    }
}

/*
Input:
    Enter Item Name: Laptop
    Enter Item Price: 50000
    Enter Item Quantity: 2
    Enter item name to remove: Charger
Output:
    Laptop added to cart.
    Total cost: 100000.0
    Charger not found in cart.
 */
