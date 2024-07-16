import java.util.Scanner;

public class Chapter15_Program24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.next();
        int inputLength = userInput.length();

        // Print the last 5 characters of the string
        System.out.println("Postfix: " + userInput.substring(inputLength - 5, inputLength));
    }
}
