import jdk.jfr.Timespan;
import jdk.jfr.Timestamp;

import java.util.Scanner;

public class Chapter15_Program65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare / Initialize variables
        String userInput = scanner.nextLine();
        String[] phrase = userInput.split("\\s+");

        // Determine if a palindrome
        if (phrase.length == 1) {
            System.out.println(isPalindrome(phrase[0]) ? "palindrome: " + phrase[0] : "not a palindrome: " + phrase[0]);
        } else {
            String phraseWithoutSpaces = String.join("", phrase);
            System.out.println(isPalindrome(phraseWithoutSpaces) ? "palindrome: " + userInput : "not a palindrome: " + userInput);
        }
        scanner.close();
    }

    // Create method that checks if there is a palindrome
    private static boolean isPalindrome(String string) {
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
}
