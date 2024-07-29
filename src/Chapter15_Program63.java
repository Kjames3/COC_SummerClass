import java.util.Scanner;

public class Chapter15_Program63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare and initialize variables
        String userText = scanner.nextLine();
        int counter = 0;
        boolean isQuestion = false;

        for (int i = 0; i < userText.length() - 1; i++) {
            if (userText.charAt(i) == '?') {
                isQuestion = true;
            }
        }

        // Remove spaces, numbers, special characters
        userText = userText.replaceAll("\\s+|\\d+|\\W", "");
        counter = userText.length();


        // Check if the text ends with a question mark
        if (isQuestion) {
            counter++;
        }

        // Print the length of the modified text
        System.out.println(counter);
    }
}
