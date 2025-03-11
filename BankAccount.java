import java.util.Scanner;

public class BankAccount {
    // Class attributes
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void depositMoney(double depositAmount) {
        if (depositAmount > 0) {
            balance += depositAmount;
            System.out.println("Amount deposited successfully!!");
            System.out.println("Current Balance After Deposit: " + balance);
        }
        else {
            System.out.println("Invalid amount");
        }
    }

    // Method to withdraw money
    public void withdrawMoney(double withdrawAmount) {
        if (withdrawAmount > 0 && withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.println("Amount withdrawn successfully!!");
            System.out.println("Current Balance After Withdrawal: " + balance);
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Current Balance: " + String.format("%.2f", balance));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder: ");
        String accountHolder = sc.nextLine();

        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter Deposit Amount: ");
        Double depositAmount = sc.nextDouble();

        System.out.print("Enter Withdrawal Amount: ");
        Double withdrawAmount = sc.nextDouble();

        BankAccount account = new BankAccount(accountHolder, accountNumber, balance);
        account.displayBalance();
        account.depositMoney(depositAmount);
        account.withdrawMoney(withdrawAmount);
    }
}

/*
Input:
    Enter Account Holder: Sehaj
    Enter Account Number: AC00001296
    Enter Balance: 10000
    Enter Deposit Amount: 550
    Enter Withdrawal Amount: 2000
Output:
    Current Balance: 10000.00
    Amount deposited successfully!!
    Current Balance After Deposit: 10550.0
    Amount withdrawn successfully!!
    Current Balance After Withdrawal: 8550.0
 */