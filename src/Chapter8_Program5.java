import java.util.Scanner;

public class Chapter8_Program5 {
    public static int countEvens(int num1, int num2, int num3, int num4, int num5) {
        int count = 0;
        if (num1 % 2 == 0) {
            count++;
        }
        if (num2 % 2 == 0) {
            count++;
        }
        if (num3 % 2 == 0) {
            count++;
        }
        if (num4 % 2 == 0) {
            count++;
        }
        if (num5 % 2 == 0) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();

        int numEvens = countEvens(num1, num2, num3, num4, num5);
        System.out.println("Total evens: " + numEvens);
    }
}
