import java.util.Scanner;

public class Chapter6_Program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        while (number > 0) {
            System.out.print(number % 2);
            number = number / 2;
            if (number == 0) {
                System.out.println();
            }
        }


    }
}
