import java.util.Scanner;

public class Circle {
    // Class Attributes
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area of circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference of circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display area of circle
    public void displayArea() {
        System.out.println("Area of circle: " + String.format("%.2f", calculateArea()));
    }

    // Method to display circumference of circle
    public void displayCircumference() {
        System.out.println("Circumference of circle: " + String.format("%.2f", calculateCircumference()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextInt();

        Circle circle = new Circle(radius);
        circle.displayArea();
        circle.displayCircumference();
    }
}

/*
Input:
    Enter radius of circle: 5
Output:
    Area of circle: 78.54
    Circumference of circle: 31.42
 */