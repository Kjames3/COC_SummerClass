import java.util.Scanner;

public class Chapter3_Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextDouble();
        double height = scanner.nextDouble();

        double volume = Math.PI * Math.pow(radius, 2) * height;
        double area = (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));

        System.out.printf("Volume (cubic inches): %.2f\n", volume);
        System.out.printf("Surface Area (square inches): %.2f\n", area);
    }
}
