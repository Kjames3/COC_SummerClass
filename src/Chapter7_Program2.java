import java.util.Scanner;

public class Chapter7_Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = scanner.nextInt();

        while (!(inputNumber == 0)) {
            System.out.println(inputNumber % 10);
            inputNumber = inputNumber / 10;
        }

    }
}
