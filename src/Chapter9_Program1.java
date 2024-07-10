import java.util.Scanner;

public class Chapter9_Program1 {
    public static int fibonacci(int n) {
        double number;
        if (n > 0)
            number = (Math.pow(1 + Math.sqrt(5), n) - (Math.pow(1 - Math.sqrt(5), n))) / (Math.pow(2, n) * Math.sqrt(5));
        else if (n == 0)
            number = 0;
        else
            number = -1;
        return (int) number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNum = scanner.nextInt();
        System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
    }
}
