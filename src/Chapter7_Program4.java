import java.util.Scanner;

public class Chapter7_Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumbers = scanner.nextInt();
        int valid = 0;
        int invalid = 0;
        int sum = 0;
        double average;

        while (!(inputNumbers == 0)) {
            if (inputNumbers <= 12 && inputNumbers >= 2) {
                valid += 1;
                sum += inputNumbers;
            } else {
                invalid += 1;
            }
            inputNumbers = scanner.nextInt();
        }
        average = (double) sum / valid;
        if (valid == 0) {
            average = 0.0;
        }
        System.out.printf("Average: %.1f\n", average);
        System.out.println("Valid: " + valid);
        System.out.println("Invalid: " + invalid);
    }
}
