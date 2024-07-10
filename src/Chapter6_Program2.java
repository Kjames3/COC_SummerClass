import java.util.Scanner;

public class Chapter6_Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int data = 0;
        double sum = 0.0;
        int numberMax = Integer.MIN_VALUE;
        int iterations = 0;
        double average;

        data = scanner.nextInt();

        while (data >= 0) {
            sum += data;
            iterations++;
            if (data > numberMax) {
                numberMax = data;
            }
            data = scanner.nextInt();
        }
        average = (double) (sum / iterations);
        System.out.printf(numberMax + " %.2f" , average);



    }
}
