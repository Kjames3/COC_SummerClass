import java.util.Scanner;
import java.lang.Math;

public class Chapter3_Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wallHeight, wallWidth, costPaint;
        wallHeight = scanner.nextDouble();
        wallWidth = scanner.nextDouble();
        costPaint = scanner.nextDouble();

        double wallArea = wallHeight * wallWidth;

        //One gallon of paint can cover 350 sq.ft of wall
        double totalPaintGallons = wallArea / 350;
        double totalPaintCans = Math.ceil(totalPaintGallons);

        //Sales tax is 7%
        double totalPaintCost = totalPaintCans * costPaint;
        double salesTax = totalPaintCost * 0.07;
        double totalCost = totalPaintCost + salesTax;


        System.out.printf("Wall area: %.1f sq ft\n",wallArea);
        System.out.printf("Paint Needed: %.3f gallons\n", totalPaintGallons);
        System.out.printf("Cans needed: %.0f can(s)\n", totalPaintCans);
        System.out.printf("Paint Cost: $%.2f\n", costPaint);
        System.out.printf("Sales Tax: $%.2f\n", salesTax * 0.07);
        System.out.printf("Total Cost: $%.2f\n", totalCost * 1.07);
    }
}
