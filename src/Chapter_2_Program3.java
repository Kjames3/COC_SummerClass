import java.util.Scanner;


public class Chapter_2_Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x;
        double y;
        double z;

        x = scanner.nextDouble();
        y = scanner.nextDouble();
        z = scanner.nextDouble();
        
        double multi = x * y;

        double firstOutput = Math.pow(x, z);
        double secondOutput = Math.pow(x,(Math.pow(y, z)));
        double thirdOutput = Math.abs(y);
        double fourthOutput = Math.sqrt(Math.pow(multi, z));

        System.out.println(firstOutput + " " + secondOutput + " " + thirdOutput + " " + fourthOutput);

    }
}
