import java.util.Scanner;

public class Employee {
    // Class Attributes
    private String name;
    private int id;
    private int salary;

    // Constructor
    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter employee id: ");
        int id = sc.nextInt();

        System.out.print("Enter employee salary: ");
        int salary = sc.nextInt();

        Employee emp = new Employee(name, id, salary);
        // Calling displayDetails() method to display employee details
        emp.displayDetails();
    }
}

/*
Input:
    Enter employee name: Sehaj
    Enter employee id: 2110991296
    Enter employee salary: 50000
Output:
    Employee Details:
    Employee Name: Sehaj
    Employee Id: 2110991296
    Employee Salary: 50000
 */