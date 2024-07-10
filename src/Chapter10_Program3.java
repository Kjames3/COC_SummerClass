import java.util.Scanner;

public class Chapter10_Program3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] userValues = new int[20];
        int threshold;
        int loopCounter = scanner.nextInt();

        for(int i = 0; i < loopCounter; i++) {
            userValues[i] = scanner.nextInt();
        }
        threshold = scanner.nextInt();


        for (int i = 0; i < loopCounter; i++) {
            if (userValues[i] < threshold) {
                System.out.printf("%d,", userValues[i]);
            }
        }
        System.out.println();
    }
}
