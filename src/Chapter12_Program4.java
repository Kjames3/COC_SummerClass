import java.util.Scanner;

public class Chapter12_Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FoodItem foodItem;

        String itemName = scanner.next();
        if (itemName.equals("Water") || itemName.equals("water")) {
            foodItem = new FoodItem();

            foodItem.printInfo();
            System.out.printf("Number of calories for %.2f serving(s): %.2f\n", 1.0, foodItem.getCalories(1.0));
        } else {
            double amountFat = scanner.nextDouble();
            double amountCarbs = scanner.nextDouble();
            double amountProtein = scanner.nextDouble();

            foodItem = new FoodItem(itemName, amountFat, amountCarbs, amountProtein);

            double numServings = scanner.nextDouble();

            foodItem.printInfo();
            System.out.printf("Number of calories for %.2f serving(s): %.2f\n", 1.0,
                    foodItem.getCalories(1.0));

            System.out.printf("Number of calories for %.2f serving(s): %.2f\n", numServings,
                    foodItem.getCalories(numServings));
        }
    }
}
