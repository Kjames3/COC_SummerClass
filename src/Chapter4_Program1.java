import java.util.Scanner;

public class Chapter4_Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2, number3;
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        number3 = scanner.nextInt();
        int maxNumber = Math.max(Math.max(number1, number2), number3);

        System.out.println("Max of [" + number1 + ", " + number2 + ", " + number3 + "] is " + maxNumber);

    }
}
