import java.io.IOException;
import java.io.FileInputStream;
import java.util.Scanner;

public class Chapter7_Program5_extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the ID to find
        int idToFind = scanner.nextInt(); // Example ID to find, you can change it to any input ID

        // Initialize variables to store the found first name and last name
        String firstName = "";
        String lastName = "";
        boolean found = false;

        // Try opening the file
        try {
            FileInputStream fileStream = new FileInputStream("CustomerDb.txt");
            Scanner fileScanner = new Scanner(fileStream);

            // Read each line in the file
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                Scanner lineScanner = new Scanner(line);

                // Read the customer ID
                int customerId = lineScanner.nextInt();

                // Check if this is the ID we are looking for
                if (customerId == idToFind) {
                    // If found, read the first name and last name
                    firstName = lineScanner.next();
                    lastName = lineScanner.next();
                    found = true;
                    lineScanner.close(); // Close the line scanner
                    break; // Exit the loop once we found the customer
                }

                lineScanner.close(); // Close the line scanner after processing each line
            }
            fileScanner.close(); // Close the file scanner
            fileStream.close(); // Close the file input stream

        } catch (IOException e) {
            System.out.println("An error occurred while opening the file.");
            e.printStackTrace();
        }

        // Output the result
        if (found) {
            System.out.println(firstName + " " + lastName);
        } else {
            System.out.println("Not found");
        }
    }
}
