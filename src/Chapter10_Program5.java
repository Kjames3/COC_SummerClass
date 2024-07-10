import java.util.Scanner;

public class Chapter10_Program5 {
    public static void swapValues(int[] values) {
        int temp1, temp2;
        temp1 = values[0];
        values[0] = values[1];
        values[1] = temp1;
        temp2 = values[2];
        values[2] = values[3];
        values[3] = temp2;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] userValues = new int[4];
        for (int i = 0; i < 4; i++) {
            userValues[i] = scanner.nextInt();
        }
        swapValues(userValues);
        for (int i = 0; i < 4; i++) {
            System.out.print(userValues[i] + " ");
            if (i == 3) {
                System.out.print(userValues[i]);
            }
        }
        System.out.println();
    }
}
