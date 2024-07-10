import java.util.Scanner;

public class Chapter7_Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumbers = scanner.nextInt();

        int loopCount = inputNumbers;

        while (!(inputNumbers <= 0)) {
            int sum = 0;
            for (int i = 0; i < loopCount; i++) {
                inputNumbers = scanner.nextInt();
                sum = sum + inputNumbers;
            }
            System.out.println(sum);
            inputNumbers = scanner.nextInt();
        }
    }
}
