import java.util.Scanner;

public class Book {
    // Class attributes
    private String title;
    private String author;
    private int price;

    // Constructor
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Book Details:");
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter book author: ");
        String author = sc.nextLine();

        System.out.print("Enter book price: ");
        int price = sc.nextInt();

        Book book = new Book(title, author, price);
        // Calling displayBookDetails() method to display book details
        book.displayBookDetails();
    }
}

/*
Input:
    Enter book title: Alice In Wonderland
    Enter book author: Lewis Carroll
    Enter book price: 149
Output:
    Book Details:
    Book Title: Alice In Wonderland
    Book Author: Lewis Carroll
    Book Price: 149
 */