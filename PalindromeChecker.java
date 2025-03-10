import java.util.Scanner;

public class PalindromeChecker {
    // Class attributes
    private String text;

    // Constructor
    public PalindromeChecker(String text){
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome(String text) {
        String string = text.toLowerCase();
        int left = 0;
        int right = string.length() - 1;

        while (left < right) {
            if (string.charAt(left) != string.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to display result
    public void displayResult() {
        if (isPalindrome(text)) {
            System.out.println("The text is a palindrome");
        }
        else {
            System.out.println("The text is not a palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        PalindromeChecker palindrome = new PalindromeChecker(text);
        // Calling displayResult() method to display result
        palindrome.displayResult();
    }
}

/*
Input:
    Enter a text: elle
Output:
    The text is a palindrome

Input:
    Enter a text: hello
Output:
    The text is not a palindrome
 */