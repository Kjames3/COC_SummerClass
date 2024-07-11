import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class Chapter14_Program4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Prompt for file name
        String fileName = scan.nextLine();

        String[] categories = new String[100];
        String[] names = new String[100];
        String[] descriptions = new String[100];
        String[] availability = new String[100];

        int count = 0;

        try {
            FileInputStream fileStream = new FileInputStream(fileName);
            Scanner fileScanner = new Scanner(fileStream);

            // Read file line by line
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] items = line.split("\t");

                // Read category, name, description, and availability from the line
                categories[count] = items[0];
                names[count] = items[1];
                descriptions[count] = items[2];
                availability[count] = items[3];

                count++;
            }
            fileScanner.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Output the available items
        for (int i = 0; i < count; i++) {
            if (availability[i].equalsIgnoreCase("available")) {
                System.out.println(names[i] + " (" + categories[i] + ") -- " + descriptions[i]);
            }
        }
        scan.close();
    }
}
