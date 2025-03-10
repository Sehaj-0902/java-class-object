import java.util.Scanner;

public class Student {
    // Class attributes
    private String name;
    private int rollNumber;
    private int marks;

    // Constructor
    public Student(String name, int rollNumber, int marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade based on the marks
    public String calculateGrades() {
        if (marks >= 90) {
            return "A";
        }
        else if (marks >= 80) {
            return "B";
        }
        else if (marks >= 70) {
            return "C";
        }
        else if (marks >= 60) {
            return "D";
        }
        else if (marks >= 50) {
            return "E";
        }
        else if (marks >= 40) {
            return "P";
        }
        else {
            return "F";
        }
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Student Details:");
        System.out.println("Student Name: " + name);
        System.out.println("Student Roll Number: " + rollNumber);
        System.out.println("Student Marks: " + marks);
        System.out.print("Student Grade: " + calculateGrades());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student Roll Number: ");
        int rollNumber = sc.nextInt();

        System.out.print("Enter Student Marks: ");
        int marks = sc.nextInt();

        Student student = new Student(name, rollNumber, marks);
        // Calling displayStudentDetails() method to display student details
        student.displayStudentDetails();
    }
}

/*
Input:
    Enter Student Name: Sehaj
    Enter Student Roll Number: 2110991296
    Enter Student Marks: 93
Output:
    Student Details:
    Student Name: Sehaj
    Student Roll Number: 2110991296
    Student Marks: 93
    Student Grade: A
 */