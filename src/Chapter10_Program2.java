import java.util.Scanner;

public class Chapter10_Program2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] userValues = new int[9];
        int index = 0;
        boolean isNine = false;

        while (true) {
            int input = scanner.nextInt();
            if (index == -1) {
                break;
            }
            userValues[index] = input;
            index++;
        }
        if (index > 8) {
            System.out.println("Too many numbers");
        } else {
            int middleValue = index / 2;
            System.out.println("Middle item: " + userValues[middleValue]);
        }
    }
}
