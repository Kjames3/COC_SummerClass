import java.util.Scanner;

public class Chapter15_Program66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1, y1, x2, y2;
        int z1, z2;

        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        z1 = scanner.nextInt();

        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        z2 = scanner.nextInt();

        boolean solutionFound = false;

        for (int x = -10; x <= 10 && !solutionFound; x++) {
            for (int y = -10; y <= 10; y++) {
                if (x1 * x + y1 * y == z1 && x2 * x + y2 * y == z2) {
                    System.out.println("x = " + x + ", y = " + y);
                    solutionFound = true;
                    break;
                }
            }
        }

        if (!solutionFound) {
            System.out.println("There is no solution");
        }
    }
}
