import java.util.Scanner;

public class Chapter15_Program10 {
    public static int pickupMinutes(int userX, int userY, int d1X, int d1Y, int d2X, int d2Y, int d3X, int d3Y) {
        int distance1 = calculateDistance(userX, userY, d1X, d1Y);
        int distance2 = calculateDistance(userX, userY, d2X, d2Y);
        int distance3 = calculateDistance(userX, userY, d3X, d3Y);

        int minDistance = Math.min(Math.min(distance1, distance2), distance3);

        return minDistance * 2;
    }

    private static int calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 -x2) + Math.abs(y1 - y2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable declaration
        int userX, userY;
        int d1X, d1Y;
        int d2X, d2Y;
        int d3X, d3Y;

        userX = scanner.nextInt();
        userY = scanner.nextInt();
        d1X = scanner.nextInt();
        d1Y = scanner.nextInt();
        d2X = scanner.nextInt();
        d2Y = scanner.nextInt();
        d3X = scanner.nextInt();
        d3Y = scanner.nextInt();

        System.out.println(pickupMinutes(userX, userY, d1X, d1Y, d2X, d2Y, d3X, d3Y));
    }
}
