import java.util.Scanner;

public class Chapter10_Program4 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numberCount = scanner.nextInt();
        double[] numberList = new double[20];
        double maxNumber = 0.0;

        for (int i = 0; i < numberCount; i++) {
            numberList[i] = scanner.nextDouble();
            if (numberList[i] > maxNumber) {
                maxNumber = numberList[i];
            }
        }
        for (int i = 0; i < numberCount; i++) {
            System.out.printf("%.2f ",(numberList[i] / maxNumber));
        }
        System.out.println();
    }
}
