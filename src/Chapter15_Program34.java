import java.util.Scanner;

public class Chapter15_Program34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double caffeineMg = scanner.nextDouble();

        System.out.printf("After 6 hours: %.2f mg", caffeineMg / 2.0);
        System.out.printf("\nAfter 12 hours: %.2f mg", caffeineMg / 4.0);
        System.out.printf("\nAfter 24 hours: %.2f mg", caffeineMg / 16.0);
    }
}
