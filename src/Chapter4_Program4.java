import java.util.Scanner;

public class Chapter4_Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputYear = scanner.nextInt();

        if (inputYear % 4 == 0) {
            if (inputYear % 100 == 0) {
                if (inputYear % 400 == 0) {
                    System.out.println(inputYear + " is a leap year.");
                } else {
                    System.out.println(inputYear + " is not a leap year.");
                }
            } else {
                System.out.println(inputYear + " is a leap year.");
            }
        } else {
            System.out.println(inputYear + " is not a leap year.");
        }
    }
}