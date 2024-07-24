import java.util.Scanner;

public class Chapter15_Program42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Declare variables
        String userChoice = scan.nextLine();

        // Determine if the user has chosen a square or a triangle and print decision
        if (userChoice.equals("square")) {
            System.out.println("***");
            System.out.println("* *");
            System.out.println("***");
        } else if (userChoice.equals("triangle")) {
            System.out.println("  *");
            System.out.println(" * *");
            System.out.println("*****");
        }

        scan.close();
    }
}
