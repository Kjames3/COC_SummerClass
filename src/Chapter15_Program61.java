import java.util.Scanner;

public class Chapter15_Program61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        String userString = scanner.next();

        // Create a while loop that examines each character in string and determines
        // if it has characters between 0-9
        boolean isValidInteger = true;
        for (int i = 0; i < userString.length(); i++) {
            char currentChar = userString.charAt(i);
            if (!Character.isDigit(currentChar)) {
                isValidInteger = false;
                break;
            }
        }

        // Print the result
        if (isValidInteger) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();

        // Print if it has the characters, Yes or No

        // Close the scanner
    }
}
