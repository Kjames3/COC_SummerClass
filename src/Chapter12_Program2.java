import java.util.Scanner;
import java.lang.Math;


public class Chapter12_Program2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Car myCar = new Car();

        int userYear = scanner.nextInt();
        int userPrice = scanner.nextInt();
        int userCurrentYear = scanner.nextInt();

        myCar.setModelYear(userYear);
        myCar.setPurchasePrice(userPrice);
        myCar.calculateCurrentValue(userCurrentYear);

        myCar.printInfo();
    }
}
