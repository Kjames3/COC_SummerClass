import java.util.Scanner;

public class Chapter15_Prorgam16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] frequencies = new double[4];
        double frequency = scan.nextDouble();
        final double multiplier = Math.pow(2, 0.08333333);
        double temp = frequency;

        for (int i = 0; i < frequencies.length; i++) {
            frequency = temp;
            frequency = frequency * Math.pow(multiplier, (i));
            frequencies[i] = frequency;
        }
        for (double v : frequencies) {
            System.out.printf("%.2f Hz\n", v);
        }
    }
}
