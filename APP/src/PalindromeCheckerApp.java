/**
 * main class - use case palindrome app
 *
 * use case 2: hardcoded Palindrome verification
 * description
 * this class demonstrate basic palindrome validation using a hardcoded string value
 *
 * the application:
 * stores a predefined string
 * compares characters from both sides
 * determine whether the string is palindrome or not
 * display the result in the console
 *
 * this demonstrate the fundamental comparison logic before using advanced data structures
 *
 *
 *
 * @author Aaditya Rauniyar
 * @version 2.0
 */
public class PalindromeCheckerApp {
    public static void main(String[] args){
        //Hardcoded string
        String word ="Aaditya";
        boolean isPalindrome=true;
        for(int i=0;i<word.length()/2;i++){
            if(word.charAt(i)!=word.charAt(word.length()-i-1)){
                isPalindrome=true;
            }
        }
        System.out.println("Input text: Aaditya");
        System.out.print("is it palindrome?:");
        if (isPalindrome){
            System.out.println("true");
        }
        else
            System.out.println("false");
    }

}