import java.util.Scanner;

public class Chapter15_Program19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Variable declarations
        int seconds, minutes, hours;
        seconds = scan.nextInt();
        minutes = scan.nextInt();
        hours = scan.nextInt();

        // Convert seconds to minutes and hours
        int totalTime = seconds + (minutes * 60) + (hours * 3600);

        System.out.println(totalTime + " seconds");
        scan.close();
    }
}
