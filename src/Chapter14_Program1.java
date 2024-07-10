import java.util.Scanner;
import java.util.InputMismatchException;

public class Chapter14_Program1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputName;
        int age;

        inputName = scan.next();
        while (!inputName.equals("-1")) {
            try {
                age = scan.nextInt();
                System.out.println(inputName + " " + (age + 1));
            } catch (InputMismatchException e) {
                System.out.println(inputName + " " + 0);
                scan.next(); // Consume the non-integer input
            }
            scan.nextLine();
            inputName = scan.next();
        }
        scan.close();
    }
}
