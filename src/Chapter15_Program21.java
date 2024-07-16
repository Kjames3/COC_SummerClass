import java.util.*;

public class Chapter15_Program21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people, slices;
        double cost, numPizzas;
        people = scanner.nextInt();

        slices = people * 2;
        numPizzas = slices / 12.0;
        cost = Math.ceil(numPizzas) * 14.95;

        System.out.println("People: " + people);
        System.out.println("Pizza(s) needed: " + (int) Math.ceil(numPizzas));
        System.out.printf("Cost for %.0f pizza(s): $%.2f\n", Math.ceil(numPizzas), cost);

        scanner.close();
    }
}
