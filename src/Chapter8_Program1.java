import java.util.Scanner;

public class Chapter8_Program1 {

    public static int feetToSteps(double feet) {
        return (int) (feet / 2.5);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double feet = scanner.nextDouble();

        int steps = feetToSteps(feet);
        System.out.println(steps);

    }
}
