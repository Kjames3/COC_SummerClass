import java.util.Scanner;

public class Chapter15_Program39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Declare variables
        String userInput = scan.nextLine();

        // Split the user input
        String[] parts = userInput.split("\\s+");
        String firstName = parts[0];
        String lastName = parts[1];
        int number = Integer.parseInt(parts[2]);

        // Format the user input into a Login name
        String loginName = firstName.substring(0, Math.min(firstName.length(),  6)) +
                            lastName.substring(0, 1) + "_" +
                            String.valueOf(number % 10);

        // Print the formatted user input
        System.out.println("Your login name: " + loginName);

        // Close the scanner
        scan.close();

    }
}
