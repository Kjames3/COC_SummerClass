import java.util.Scanner;

public class Chapter2_Program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nickels;
        int dimes;
        int quarters;

        nickels = scanner.nextInt();
        dimes = scanner.nextInt();
        quarters = scanner.nextInt();

        double nickelInDollars = nickels * 0.05;
        double dimeInDollars = dimes * 0.10;
        double quarterInDollars = quarters * 0.25;

        double totalInDollars = nickelInDollars + dimeInDollars + quarterInDollars;

        System.out.print("Amount: $");
        System.out.printf("%.2f", totalInDollars);
    }
}
