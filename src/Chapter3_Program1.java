import java.util.Scanner;

public class Chapter3_Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gasMileage = scanner.nextDouble();
        double gasPrice = scanner.nextDouble();

        double pricePerMile = gasPrice / gasMileage;

        double price20Miles = pricePerMile * 20;
        double price75Miles = pricePerMile * 75;
        double price500Miles = pricePerMile * 500;

        System.out.printf("%.2f", price20Miles);
        System.out.print(" ");
        System.out.printf("%.2f", price75Miles);
        System.out.print(" ");
        System.out.printf("%.2f", price500Miles);
        System.out.println();
    }
}