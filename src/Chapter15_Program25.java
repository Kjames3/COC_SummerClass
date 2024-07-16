import java.util.Scanner;

public class Chapter15_Program25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.next();

        System.out.println("Prefix: " + userInput.substring(0, 5));

        scanner.close();
    }
}
