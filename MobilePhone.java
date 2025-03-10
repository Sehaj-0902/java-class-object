import java.util.Scanner;

public class MobilePhone {
    // Class attributes
    private String brand;
    private String model;
    private int price;

    // Constructor
    public MobilePhone(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display mobile phone details
    public void displayMobilePhoneDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Mobile Phone Brand: " + brand);
        System.out.println("Mobile Phone Model: " + model);
        System.out.println("Mobile Phone Price: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mobile Phone Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Mobile Phone Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Mobile Phone Price: ");
        int price = sc.nextInt();

        MobilePhone phone = new MobilePhone(brand, model, price);
        // Calling displayMobilePhoneDetails() method to display mobile phone details
        phone.displayMobilePhoneDetails();
    }
}

/*
Input:
    Enter Mobile Phone Brand: Samsung
    Enter Mobile Phone Model: S23 FE
    Enter Mobile Phone Price: 50000
Output:
    Mobile Phone Details:
    Mobile Phone Brand: Samsung
    Mobile Phone Model: S23 FE
    Mobile Phone Price: 50000
 */