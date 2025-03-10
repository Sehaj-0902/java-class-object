import java.util.Scanner;

public class Item {
    // Class attributes
    private int itemCode;
    private String itemName;
    private int price;

    // Constructor
    public Item(int itemCode, String itemName, int price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item Details:");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + price);
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
            return price * quantity;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Code: ");
        int itemCode = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Item Name: ");
        String itemName = sc.nextLine();

        System.out.print("Enter Item Price: ");
        int price = sc.nextInt();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        Item item = new Item(itemCode, itemName, price);
        // Calling displayItemDetails() method to display item details
        item.displayItemDetails();

        System.out.println("Total cost: " + String.format("%.2f", item.calculateTotalCost(quantity)));
    }
}

/*
Input:
    Enter Item Code: 101
    Enter Item Name: Laptop
    Enter Item Price: 75000
    Enter quantity: 3
Output:
    Item Details:
    Item Code: 101
    Item Name: Laptop
    Item Price: 75000
    Total cost: 225000.00
 */