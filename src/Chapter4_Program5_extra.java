import java.util.Scanner;

public class Chapter4_Program5_extra {
    public static void printCoins(int count, String singular, String plural) {
        if (count == 1) {
            System.out.println(count + " " + singular);
        } else {
            System.out.println(count + " " + plural);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int inputChange = scanner.nextInt();
        int dollars, quarters, dimes, nickles, pennies;

        dollars = inputChange / 100;
        inputChange = inputChange % 100;
        quarters = inputChange / 25;
        inputChange = inputChange % 25;
        dimes = inputChange / 10;
        inputChange = inputChange % 10;
        nickles = inputChange / 5;
        inputChange = inputChange % 5;
        pennies = inputChange;

        printCoins(dollars, "dollar", "dollars");
        printCoins(quarters, "quarter", "quarters");
        printCoins(dimes, "dime", "dimes");
        printCoins(nickles, "nickel", "nickels");
        printCoins(pennies, "penny", "pennies");
    }
}
