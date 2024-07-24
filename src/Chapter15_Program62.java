import java.util.Scanner;

public class Chapter15_Program62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare and Initialize variables
        String userInput = scanner.nextLine();

        // Modify the given userInput to be password compliant
        userInput = userInput.replace("i", "1").replace("a", "@").replace("m", "M").replace("B", "8").replace("s", "$");
        userInput += "!";

        // Print the modified userInput
        System.out.println(userInput);

        // Close scanner
        scanner.close();
    }
}
