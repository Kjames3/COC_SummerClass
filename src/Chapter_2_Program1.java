import java.util.Scanner;

public class Chapter_2_Program1 {
    public static void main(String[] args) {
        System.out.println("Please provide 2 numbers: ");
        Scanner scanner = new Scanner(System.in);

        int largeNum;
        int smallNum;

        largeNum = scanner.nextInt();
        smallNum = scanner.nextInt();

        for (int i = 0; i < 3; i++) {
            int n = largeNum / smallNum;
            if (i < 2) {
                System.out.print(n+" ");
            } else {
                System.out.println(n);
            }
            largeNum = n;
        }
    }
}
