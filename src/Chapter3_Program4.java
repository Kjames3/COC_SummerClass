import java.util.Scanner;

public class Chapter3_Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1, x2, y1, y2;
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();

        double firstNumbers = x2 - x1;
        double secondNumbers = y2 - y1;

        double distance = Math.sqrt(Math.pow(firstNumbers, 2) + Math.pow(secondNumbers, 2));

        System.out.println(distance);
    }
}
