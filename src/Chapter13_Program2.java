import java.util.Scanner;

public class Chapter13_Program2 {
    public static void printMenu() {
        System.out.println("\nMENU");
        System.out.println("a - Add item to cart");
        System.out.println("d - Remove item from cart");
        System.out.println("c - Change item quantity");
        System.out.println("i - Output items' descriptions");
        System.out.println("o - Output shopping cart");
        System.out.println("q - Quit");
        System.out.println();
    }

    public static void executeMenu(char option, ShoppingCart cart, Scanner scanner) {
        switch (option) {
            case 'a':
                System.out.println("ADD ITEM TO CART");
                System.out.println("Enter the item name:");
                String name = scanner.nextLine();
                System.out.println("Enter the item description:");
                String description = scanner.nextLine();
                System.out.println("Enter the item price:");
                int price = scanner.nextInt();
                System.out.println("Enter the item quantity:");
                int quantity = scanner.nextInt();
                scanner.nextLine();
                System.out.println();

                ItemToPurchase item = new ItemToPurchase(name, description, price, quantity);
                cart.addItem(item);
                break;
            case 'd':
                System.out.println("REMOVE ITEM FROM CART");
                System.out.println("Enter name of item to remove:");
                name = scanner.nextLine();
                System.out.println();
                cart.removeItem(name);
                break;

            case 'c':
                System.out.println("CHANGE ITEM QUANTITY");
                System.out.println("Enter the item name:");
                name = scanner.nextLine();
                System.out.println("Enter the new quantity:");
                quantity = scanner.nextInt();
                scanner.nextLine(); // consume newline


                ItemToPurchase newItem = new ItemToPurchase();
                newItem.setName(name);
                newItem.setQuantity(quantity);
                cart.modifyItem(newItem);
                break;

            case 'i':
                System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
                cart.printDescription();
                System.out.println();
                break;

            case 'o':
                System.out.println("OUTPUT SHOPPING CART");
                cart.printTotal();
                break;

            case 'q':
                break;

//            default:
//                System.out.println("Invalid option");
//                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter customer's name:");
        String customerName = scanner.nextLine();
        System.out.println("Enter today's date:");
        String currentDate = scanner.nextLine();

        ShoppingCart cart = new ShoppingCart(customerName, currentDate);

        System.out.println("Customer name: " + customerName);
        System.out.println("Today's date: " + currentDate);
        System.out.println();

        printMenu();

        char option = ' ';
        while (option != 'q') {
            System.out.println("Choose an option:");
            option = scanner.nextLine().charAt(0);
            if (option == 'a' || option == 'd' || option == 'c' || option == 'i' || option == 'o') {
                executeMenu(option, cart, scanner);
                printMenu();
            }
        }

        scanner.close();
    }
}
