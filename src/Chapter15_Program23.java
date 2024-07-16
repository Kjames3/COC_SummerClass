import java.util.Scanner;

public class Chapter15_Program23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();
        int inputLength = userInput.length();

        // Print middle 5 characters in string
        System.out.println("Midfix: " + userInput.substring(inputLength / 2 - 2, inputLength / 2 + 3));
    }
}
