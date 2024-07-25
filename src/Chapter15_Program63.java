import java.util.Scanner;

public class Chapter15_Program63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare and initialize variables
        String userText = scanner.nextLine();


        // TODO: Fix problem here with the ? character
        // Remove spaces, numbers, special characters
        userText = userText.replaceAll("\\s+|\\d+|\\W", "");

        // Print the length of the modified text
        System.out.println(userText.length());
    }
}
