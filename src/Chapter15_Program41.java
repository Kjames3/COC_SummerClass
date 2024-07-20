import java.util.Scanner;

public class Chapter15_Program41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();

        System.out.printf("Max of %d and %d is %d\n", firstNumber, secondNumber, Math.max(firstNumber, secondNumber));

        scan.close();
    }
}
