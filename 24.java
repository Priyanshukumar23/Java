import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = "madam";

        // Print each character on a new line
        System.out.println("\nCharacters in the string:");
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }

        // Check if the string is a palindrome (case-insensitive)
        String lower = input.toLowerCase();
        boolean isPalindrome = true;

        for (int i = 0; i < lower.length() / 2; i++) {
            if (lower.charAt(i) != lower.charAt(lower.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Output the result
        if (isPalindrome) {
            System.out.println("\nThe string is a palindrome.");
        } else {
            System.out.println("\nThe string is not a palindrome.");
        }
    }
}
