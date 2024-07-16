import java.util.Scanner;

public class Chapter15_Program18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInt;
        double userDouble;
        char userChar;
        String userString;

        System.out.println("Enter integer:");
        userInt = scan.nextInt();
        System.out.println("Enter double:");
        userDouble = scan.nextDouble();
        System.out.println("Enter character:");
        userChar = scan.next().charAt(0);
        System.out.println("Enter string:");
        userString = scan.next();
        System.out.printf("%d %.2f %s %s\n", userInt, userDouble, userChar, userString);
        System.out.printf("%s %s %.2f %d\n", userString, userChar, userDouble, userInt);
        System.out.printf("%.2f cast to an integer is %.0f\n", userDouble, Math.floor(userDouble));
    }
}
