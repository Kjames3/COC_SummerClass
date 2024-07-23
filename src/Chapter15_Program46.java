import java.util.Scanner;

public class Chapter15_Program46 {
    private static int getDaysInMonth(int month) {
        switch (month) {
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Declare variables
        String userInput = scan.nextLine();

        // Split the user input into day, month, and year and place them in an array
        String[] parts = userInput.split(" ");
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        // Validate if the day, month, and year are valid
        if (day < 1 || month < 1 || month > 12 || year < 1) {
            System.out.println("Invalid date");
            return;
        }

        // Calculate the number of days in the given month
        int daysInMonth = getDaysInMonth(month);

        // Calculate the next date
        int nextDay = day + 1;
        int nextMonth = month;
        int nextYear = year;

        if (nextDay > daysInMonth) {
            nextDay = 1;
            nextMonth++;

            if (nextMonth > 12) {
                nextMonth = 1;
                nextYear++;
            }
        }

        // Print the next date and the corresponding day and year
        System.out.println(nextMonth + " " + nextDay + " " + nextYear);

        // Close the scanner
        scan.close();
    }
}
