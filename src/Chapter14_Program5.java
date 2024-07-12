import java.util.Scanner;
import java.util.ArrayList;

public class Chapter14_Program5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Initialize ArrayLists to store data
        ArrayList<String> dataString = new ArrayList<>();
        ArrayList<Integer> dataInt = new ArrayList<>();
        String header, firstColumn, lastColumn;

        // Prompt the user for the title of the Data
        System.out.println("Enter a title for the data:");
        header = scan.nextLine();
        System.out.printf("You entered: %s\n", header);
        System.out.println();

        // Prompt the user for the first column name
        System.out.println("Enter the column 1 header:");
        firstColumn = scan.nextLine();
        System.out.printf("You entered: %s\n", firstColumn);
        System.out.println();

        // Prompt the user for the last column name
        System.out.println("Enter the column 2 header:");
        lastColumn = scan.nextLine();
        System.out.printf("You entered: %s\n", lastColumn);
        System.out.println();

        // Prompt the user to enter data for each row
        while (true) {
            System.out.println("Enter a data point (-1 to stop input):");
            String input = scan.nextLine();

            if (input.equals("-1")) {
                System.out.println();
                break;
            }

            int commaCount = input.length() - input.replace(",","").length();
            if (commaCount == 0) {
                System.out.println("Error: No comma in string.");
                System.out.println();
                continue;
            } else if (commaCount > 1) {
                System.out.println("Error: Too many commas in input.");
                System.out.println();
                continue;
            }

            String[] parts = input.split(",");
            if (parts.length!= 2) {
                System.out.println("Error: Incorrect number of elements in string.");
                continue;
            }

            String stringData = parts[0].trim();
            String numberString = parts[1].trim();

            int numberData;
            try {
                numberData = Integer.parseInt(numberString);
            } catch (NumberFormatException e) {
                System.out.println("Error: Comma not followed by an integer.");
                System.out.println();
                continue;
            }

            dataString.add(stringData);
            dataInt.add(numberData);

            System.out.printf("Data string: %s\n", stringData);
            System.out.printf("Data integer: %d\n", numberData);
            System.out.println();
        }

        // Output formatted table
        System.out.printf("%33s\n", header);
        System.out.printf("%-20s|%23s\n", firstColumn, lastColumn);
        System.out.println("--------------------------------------------");
        for (int i = 0; i < dataString.size(); i++) {
            System.out.printf("%-20s|%23d\n", dataString.get(i), dataInt.get(i));
        }
        System.out.println();

        // Output the formated histogram
        for (int i = 0; i < dataString.size(); i++) {
            System.out.printf("%20s ", dataString.get(i));
            for (int j = 0; j < dataInt.get(i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }
}
