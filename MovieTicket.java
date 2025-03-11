import java.util.Scanner;

public class MovieTicket {
    // Class attributes
    private String movieName;
    private int seatNumber;
    private double price;

    // Constructor
    public MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to book tickets
    public void bookTickets(int seatNumber, double price) {
        if (seatNumber > 0 && price > 0) {
            displayTicketDetails();
        }
        else {
            System.out.println("Invalid seat number or price.");
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        if (seatNumber > 0) {
            System.out.println("Movie Details: \n Ticket booked successfully!!");
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: " + price);
        }
        else {
            System.out.println("Ticket not booked");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Movie Name: ");
        String movieName = sc.nextLine();

        System.out.print("Enter Seat Number: ");
        int seatNumber = sc.nextInt();

        System.out.print("Enter Ticket Price: ");
        double price = sc.nextDouble();

        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);
        // Calling displayTicketDetails() method to display movie ticket details
        ticket.displayTicketDetails();
    }
}

/*
Input:
    Enter Movie Name: Alice In Wonderland
    Enter Seat Number: 11
    Enter Ticket Price: 149.0
Output:
    Movie Details:
     Ticket booked successfully!!
    Movie Name: Alice In Wonderland
    Seat Number: 11
    Price: 149.0
 */