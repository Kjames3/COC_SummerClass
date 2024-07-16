import java.util.Scanner;

public class Chapter15_Program26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double userInput = scanner.nextDouble();

        System.out.printf("Square root of %.2f = %.2f\n", userInput, Math.sqrt(userInput));
    }
}