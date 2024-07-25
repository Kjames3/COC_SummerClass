import java.util.Scanner;

public class Chapter15_Program68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum, endNum, multiples;

        startNum = scanner.nextInt();
        endNum = scanner.nextInt();
        multiples = scanner.nextInt();

        System.out.print("Multiples of " + multiples + ": ");

        for (int i = startNum; i < endNum; i++) {
            if (i % multiples == 0) {
                System.out.print(i + ",");
            }
        }
    }
}
