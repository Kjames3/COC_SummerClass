import java.util.Scanner;
import java.lang.Math;

public class Chapter3_Prorgam6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Order #1");
        double carpetPrice;
        int roomWidth, roomLength;
        carpetPrice = scanner.nextDouble();
        roomWidth = scanner.nextInt();
        roomLength = scanner.nextInt();

        int areaSquareFeet = roomWidth * roomLength;
        double carpetPricePerSquareFeet = (carpetPrice * areaSquareFeet) * 1.2;

        //Labor cost is $0.75 per square foot
        double labor = (areaSquareFeet * 0.75);

        //Sales tax is 7%
        double salesTax = (carpetPricePerSquareFeet + labor) * 0.07;

        double totalCost = carpetPricePerSquareFeet + labor + salesTax;
        double totalSales = totalCost;

        System.out.println("Room: " + areaSquareFeet + " sq ft");
        System.out.printf("Carpet: $%.2f\n", carpetPricePerSquareFeet);
        System.out.printf("Labor: $%.2f\n", labor);
        System.out.printf("Tax: $%.2f\n", salesTax);
        System.out.printf("Cost: $%.2f\n", totalCost);

        System.out.println("Order #2");
        double carpetPrice2;
        int roomWidth2, roomLength2;
        carpetPrice2 = scanner.nextDouble();
        roomWidth2 = scanner.nextInt();
        roomLength2 = scanner.nextInt();

        int areaSquareFeet2 = roomWidth2 * roomLength2;
        double carpetPricePerSquareFeet2 = (carpetPrice2 * areaSquareFeet2) * 1.2;

        //Labor cost is $0.75 per square foot
        double labor2 = (areaSquareFeet2 * 0.75);

        //Sales tax is 7%
        double salesTax2 = (carpetPricePerSquareFeet2 + labor2) * 0.07;

        double totalCost2 = carpetPricePerSquareFeet2 + labor2 + salesTax2;
        totalSales = totalCost + totalCost2;

        System.out.println("Room: " + areaSquareFeet2 + " sq ft");
        System.out.printf("Carpet: $%.2f\n", carpetPricePerSquareFeet2);
        System.out.printf("Labor: $%.2f\n", labor2);
        System.out.printf("Tax: $%.2f\n", salesTax2);
        System.out.printf("Cost: $%.2f\n", totalCost2);

        System.out.println("Order #3");
        double carpetPrice3;
        int roomWidth3, roomLength3;
        carpetPrice3 = scanner.nextDouble();
        roomWidth3 = scanner.nextInt();
        roomLength3 = scanner.nextInt();

        int areaSquareFeet3 = roomWidth3 * roomLength3;
        double carpetPricePerSquareFeet3 = (carpetPrice3 * areaSquareFeet3) * 1.2;

        //Labor cost is $0.75 per square foot
        double labor3 = (areaSquareFeet3 * 0.75);

        //Sales tax is 7%
        double salesTax3 = (carpetPricePerSquareFeet3 + labor3) * 0.07;

        double totalCost3 = carpetPricePerSquareFeet3 + labor3 + salesTax3;
        totalSales = totalCost + totalCost2 + totalCost3;

        System.out.println("Room: " + areaSquareFeet3 + " sq ft");
        System.out.printf("Carpet: $%.2f\n", carpetPricePerSquareFeet3);
        System.out.printf("Labor: $%.2f\n", labor3);
        System.out.printf("Tax: $%.2f\n", salesTax3);
        System.out.printf("Cost: $%.2f\n", totalCost3);
        System.out.println();
        System.out.printf("Total Sales: $%.2f\n", totalSales);
    }
}
