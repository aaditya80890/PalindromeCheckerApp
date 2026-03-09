import java.util.LinkedList;

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC8
     */
    public static void main(String[] args) {

        // Define the input string (Hardcoded)
        String input = "level";

        // Create LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character of the string into the LinkedList
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare first and last characters until list size <= 1
        while (list.size() > 1) {

            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}