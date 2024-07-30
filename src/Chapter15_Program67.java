import java.util.Scanner;

public class Chapter15_Program67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character:");
        char triangleCharacter = scanner.next().charAt(0);
        System.out.println("Enter triangle height:");
        int triangleHeight = scanner.nextInt();

        System.out.println();

        for (int i = 0; i < triangleHeight; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangleCharacter + " ");
            }
            System.out.println();
        }

        scanner.close();

    }
}
