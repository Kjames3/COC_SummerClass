import java.util.Scanner;

public class Chapter15_Program38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Variable declaration
        String userInput = scan.nextLine();

        // Split the input into parts
        String[] parts = userInput.split("\\s+");
        String formattedName;

        // Check if the input contains exactly three parts & format name
        if (parts.length == 3) {
            formattedName = parts[2] + ", " + parts[0].charAt(0) + "." + parts[1].charAt(0) + ".";
        } else {
            formattedName = parts[1] + ", " + parts[0].charAt(0) + ".";
        }

        // Print the formatted name
        System.out.println(formattedName);

        // Close the scanner
        scan.close();
    }
}
