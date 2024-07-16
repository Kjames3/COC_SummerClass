import java.util.Scanner;

public class Chapter15_Program27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double userNum1 = scanner.nextDouble();
        double userNum2 = scanner.nextDouble();
        double userNum3 = scanner.nextDouble();
        double s = (userNum1 + userNum2 + userNum3) / 2.0;

        double area = s * (s-userNum1) * (s-userNum2) * (s-userNum3);
        System.out.printf("Triangle area = %.2f\n", Math.sqrt(area));
    }
}
