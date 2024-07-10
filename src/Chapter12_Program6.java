import java.util.Scanner;

public class Chapter12_Program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstPurchase, restock, secondPurchase;

        firstPurchase = scanner.nextInt();
        restock = scanner.nextInt();
        secondPurchase = scanner.nextInt();

        VendingMachine machine = new VendingMachine();
        machine.purchase(firstPurchase);
        machine.restock(restock);
        machine.purchase(secondPurchase);

        machine.report();
    }
}
