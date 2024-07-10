import java.util.Scanner;


public class LabProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentPrice;
        int lastMonthPrice;
        double mortgage;

        currentPrice = scanner.nextInt();
        lastMonthPrice = scanner.nextInt();

        int priceDifference = currentPrice - lastMonthPrice;

        mortgage = (double) ((currentPrice * 0.051) / 12);

        System.out.println("This house is " + currentPrice + ". The change is $" + priceDifference + "since last month.");
        System.out.println("The monthly mortgage payment is $" + mortgage);
    }
}
