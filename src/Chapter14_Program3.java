import java.util.Scanner;
import java.util.InputMismatchException;

public class Chapter14_Program3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNum, divNum;
        try {
            userNum = scan.nextInt();
            divNum = scan.nextInt();
            System.out.println(userNum / divNum);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: / by zero");
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch Exception: java.util.InputMismatchException");
        }

        scan.close();
    }
}
