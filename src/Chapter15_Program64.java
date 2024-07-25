import java.util.Scanner;

public class Chapter15_Program64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare/Initialize variables
        int userNum = scanner.nextInt();

        // Check if the user Number is in between 11-99
        if (userNum >= 11 && userNum <= 99) {
            while (true) {
                if (userNum % 11 == 0) {
                    System.out.print(userNum + " ");
                    break;
                }
                System.out.print(userNum + " ");
                userNum--;
            }
        } else {
            System.out.println("Input must be 11-99");
        }
    }
}
