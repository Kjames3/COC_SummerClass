import java.util.Scanner;

public class Chapter2_Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        num4 = scanner.nextInt();

        int product = num1 * num2 * num3 * num4;
        int average = (num1 + num2 + num3 + num4) / 4;
        double averageDouble = (double) (num1 + num2 + num3 + num4) / 4;

        double productDouble = (double) num1 * num2 * num3 * num4;

        System.out.println(product + " " + average);
        System.out.printf("%.3f", productDouble);
        System.out.print(" ");
        System.out.printf("%.3f", averageDouble);
        System.out.println();
    }
}
