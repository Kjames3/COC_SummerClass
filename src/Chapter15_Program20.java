import java.util.Scanner;

public class Chapter15_Program20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variable declaration
        int seconds, minutes, hours;
        seconds = scan.nextInt();
        //Convert seconds to seconds, minutes and hours
        hours = seconds / 3600;
        minutes = (seconds % 3600) / 60;
        seconds = (seconds % 3600) % 60;

        //Print the result in the format: "XX hours, YY minutes, ZZ seconds"
        System.out.println("Seconds: " + seconds);
        System.out.println("Minutes: " + minutes);
        System.out.println("Hours: " + hours);
    }
}
