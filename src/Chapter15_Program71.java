import java.util.Scanner;

public class Chapter15_Program71 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, i;
        System.out.println("Enter an integer:");
        n = scan.nextInt();

        if (n < 0) {
            System.out.println("Sequence: 0 ");
        } else {
            System.out.print("Sequence: ");
            for (i = n; i >= 0; i--) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
