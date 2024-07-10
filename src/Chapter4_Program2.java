import java.util.Scanner;

public class Chapter4_Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r, g, b;
        r = scanner.nextInt();
        g = scanner.nextInt();
        b = scanner.nextInt();

        int gray = Math.min(r, Math.min(g, b));

        r -= gray;
        g -= gray;
        b -= gray;

        System.out.println(r + " " + g + " " + b);
    }
}
