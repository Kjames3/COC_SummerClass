import java.util.Scanner;

public class Chapter13_Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        ItemToPurchase item1 = new ItemToPurchase();
//        ItemToPurchase item2 = new ItemToPurchase();

        ItemToPurchase[] items = new ItemToPurchase[2];

        String[] itemNames = new String[2];
        Integer[] itemPrices = new Integer[2];
        Integer[] itemQuantities = new Integer[2];

        int itemCost, item2Cost, totalCost;

        for (int i = 0; i < itemNames.length; i++) {
            System.out.println("Item " + (i + 1));
            System.out.println("Enter the item name:");
            itemNames[i] = scanner.nextLine();

            System.out.println("Enter the item price:");
            itemPrices[i] = scanner.nextInt();
            scanner.next();

            System.out.println("Enter the item quantity:");
            itemQuantities[i] = scanner.nextInt();
            scanner.next();

            System.out.println();

            items[i] = new ItemToPurchase();
            items[i].setName(itemNames[i]);
            items[i].setPrice(itemPrices[i]);
            items[i].setQuantity(itemQuantities[i]);
            if (i < 1) {
                scanner.nextLine();
            }
        }

        scanner.close();

        itemCost = items[0].getPrice() * items[0].getQuantity();
        item2Cost = items[1].getPrice() * items[1].getQuantity();
        totalCost = itemCost + item2Cost;

        // Print total Cost
        System.out.println("TOTAL COST");
        System.out.printf("%s %d @ $%d = %d\n", items[0].getName(), items[0].getQuantity(), items[0].getPrice(), itemCost);
        System.out.printf("%s %d @ $%d = %d\n", items[1].getName(), items[1].getQuantity(), items[1].getPrice(), item2Cost);
        System.out.println();
        System.out.printf("Total: $%d\n", totalCost);
    }
}
