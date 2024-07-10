import java.util.Scanner;

public class Chapter9_Program2 {
    public static int daysInFeb(int userYear) {
        if (userYear % 4 == 0) {
            if (userYear % 100 == 0) {
                if (userYear % 400 == 0) {
                    return 29;
                } else {
                    return 28;
                }
            } else {
                return 29;
            }
        } else {
            return 28;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputYear = scanner.nextInt();

        System.out.println(inputYear + " has " + daysInFeb(inputYear) + " days in February.");
    }
}
