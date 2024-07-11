import java.util.Scanner;
import java.util.ArrayList;

public class Chapter14_Program5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> dataString = new ArrayList<String>();
        ArrayList<Integer> dataInt = new ArrayList<Integer>();
        String header, firstColumn, lastColumn;

        // Prompt the user for the title of the Data
        System.out.println("Enter a title for the data:");
        header = scan.nextLine();
        System.out.printf("You entered: %s\n", header);
        System.out.println();

        // Prompt the user for the first column name
        System.out.println("Enter the first column name:");
        firstColumn = scan.nextLine();
        System.out.printf("You entered: %s\n", firstColumn);
        System.out.println();

        // Prompt the user for the last column name
        System.out.println("Enter the last column name:");
        lastColumn = scan.nextLine();
        System.out.printf("You entered: %s\n", lastColumn);
        System.out.println();

        // Prompt the user to enter data for each row

        scan.close();
    }
}
