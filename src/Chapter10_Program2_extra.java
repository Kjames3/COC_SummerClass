import java.util.Scanner;

public class Chapter10_Program2_extra {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] userValues = new int[9];
        int index = 0;

        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            if (index > 8) {
                System.out.println("Too Many numbers");
                System.exit(0);
            }
            userValues[index] = input;
            index++;
        }
        if (index == 9) {
            int middleValue = index / 2;
            System.out.println("Middle item: " + userValues[middleValue]);
        }
        if (index <= 8) {
            int middleValue = index / 2;
            System.out.println("Middle item: " + userValues[middleValue]);
        }
    }
}
