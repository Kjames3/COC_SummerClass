import java.util.Scanner;

public class Chapter15_Program45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable declaration
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        String period = scanner.next();
        String correctFormat, correctedMinute, correctedHour;


        // Convert the time from 12-hour format to 24-hour format
        if (period.equalsIgnoreCase("AM")) {
            correctedMinute = Integer.toString(minutes);
            correctedHour = Integer.toString(hours);

            // Format hours
            if (hours < 10) {
                correctedHour = "0" + hours;
            } else if (hours == 12) {
                correctedHour = "00";
            }

            // Format minutes
            if (minutes < 10) {
                correctedMinute = "0" + minutes;
            }

            correctFormat = correctedHour + ":" + correctedMinute;
        } else {
            correctedMinute = Integer.toString(minutes);
            correctedHour = Integer.toString(hours);

            // Format hours
            if (hours < 12) {
                correctedHour = Integer.toString(hours + 12);
            } else if (hours == 12) {
                correctedHour = Integer.toString(hours);
            }

            // Format minutes
            if (minutes < 10) {
                correctedMinute = "0" + minutes;
            }
            correctFormat = correctedHour + ":" + correctedMinute;
        }

        // Print the correct format
        System.out.println(correctFormat);

        // Close scanner
        scanner.close();
    }
}
