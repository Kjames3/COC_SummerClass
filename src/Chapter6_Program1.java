import java.util.Scanner;

public class Chapter6_Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2;
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("Second integer can't be less than the first.");
        } else {
            while (num1 <= num2) {
                System.out.print(num1 + " ");
                num1 = num1 + 5;
                if (num1 > num2) {
                    System.out.println();
                }
            }
        }
    }
}
