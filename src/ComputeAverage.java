import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();

        double average = (number1 + number2 + number3) / 3.0;

        System.out.printf("The average of " + number1 + ", " + number2 + ", and " + number3 + " is %." + average);
    }
}
