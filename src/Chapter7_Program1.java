import java.util.Scanner;

public class Chapter7_Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNumber = Integer.MIN_VALUE;
        int inputNumber = scanner.nextInt();
        while (inputNumber > -1) {
            if (inputNumber > maxNumber) {
                maxNumber = inputNumber;
            }
            inputNumber = scanner.nextInt();
        }
        System.out.println("Largest integer: " + maxNumber);
    }
}
