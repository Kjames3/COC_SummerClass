import java.util.Scanner;

public class Chapter15_Program47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable declaration
        int runwayNumber = scanner.nextInt();
        int runwayDeg = runwayNumber * 10;
        String direction;

        // Determine the direction
        if ((runwayDeg > -22.5 && runwayDeg < 22.5) || runwayDeg == 360) {
            direction = "north";
        } else if (runwayDeg > 22.5 && runwayDeg < 67.5) {
            direction = "northeast";
        } else if (runwayDeg >= 67.5 && runwayDeg < 112.5) {
            direction = "east";
        } else if (runwayDeg >= 112.5 && runwayDeg < 157.5) {
            direction = "southeast";
        } else if (runwayDeg >= 157.5 && runwayDeg < 202.5) {
            direction = "south";
        } else if (runwayDeg >= 202.5 && runwayDeg < 247.5) {
            direction = "southwest";
        } else if (runwayDeg >= 247.5 && runwayDeg < 292.5) {
            direction = "west";
        } else {
            direction = "northwest";
        }

        // Print runway
        System.out.println(runwayDeg + " degrees (" + direction + ")");

        // Close the scanner
        scanner.close();
    }
}
