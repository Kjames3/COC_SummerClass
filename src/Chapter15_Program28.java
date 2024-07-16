import java.util.Scanner;

public class Chapter15_Program28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPizzas = scanner.nextInt();
        final double costPerPizza = 14.99;
        final double tax = 1.08;

        double subtotal = numPizzas * costPerPizza;
        double totalDue = subtotal * tax;

        System.out.println("Pizzas: " + numPizzas);
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Total due: $%.2f\n", totalDue);

        scanner.close();
    }
}
