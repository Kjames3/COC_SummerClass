import java.util.Scanner;

public class Chapter4_Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputChange = scanner.nextInt();
        int dollars, quarters, dimes, nickels, pennies;
        int remainingChange;

        dollars = inputChange / 100;
        remainingChange = inputChange % 100;
        quarters = remainingChange / 25;
        remainingChange = remainingChange % 25;
        dimes = remainingChange / 10;
        remainingChange = remainingChange % 10;
        nickels = remainingChange / 5;
        remainingChange = remainingChange % 5;
        pennies = remainingChange;

        /*System.out.println("Dollars: " + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
        */
        if (dollars == 1) {
            System.out.println(dollars + " Dollar");
        } else if (dollars > 1) {
            System.out.println(dollars + " Dollars");
        }
        if(quarters == 1){
            System.out.println(quarters + " Quarter");
        } else if (quarters > 1) {
            System.out.println(quarters + " Quarters");
        }
        if(dimes == 1){
            System.out.println(dimes + " Dime");
        } else if (dimes > 1) {
            System.out.println(dimes + " Dimes");
        }
        if (nickels == 1){
            System.out.println(nickels + " Nickel");
        } else if (nickels > 1){
            System.out.println(nickels + " Nickels");
        }
        if (pennies == 1){
            System.out.println(pennies + " Penny");
        } else if (pennies > 1) {
            System.out.println(pennies + " Pennies");
        } else if (inputChange == 0)  {
            System.out.println("No change");
        }
    }
}
