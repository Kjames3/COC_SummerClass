import java.util.Scanner;

public class Chapter5_Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int passengerAge, carryOns, checkedBags, airFare;

        passengerAge = scanner.nextInt();
        carryOns = scanner.nextInt();
        checkedBags = scanner.nextInt();

        if (passengerAge >= 60) {
            airFare = 290;
        } else if (passengerAge <= 2) {
            airFare = 0;
        } else {
            airFare = 300;
        }

        airFare = airFare + (carryOns * 10);

        int sum = 0;
        for (int i = 0; i < checkedBags + 1; i++) {
            if (i == 2) {
                sum = sum + 25;
            } else if (i > 2) {
                sum = sum + 50;
            }
        }
        airFare = airFare + sum;

        System.out.println(airFare);
    }
}
