import java.util.Scanner;

public class Chapter15_Program48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        String firstName1, lastName1;
        String firstName2, lastName2;
        String firstName3, lastName3;

        // Prompt the user to enter the first name and last name of the first person
        firstName1 = scanner.next();
        lastName1 = scanner.next();
        firstName2 = scanner.next();
        lastName2 = scanner.next();
        firstName3 = scanner.next();
        lastName3 = scanner.next();

        // Determine the format
        if (firstName1.equals("none")) {
            System.out.println("TBD");
        } else if (firstName2.equals("none")) {
            System.out.println(firstName1.charAt(0) + ". " + lastName1);
        } else if (firstName3.equals("none")) {
            System.out.println(lastName1 + " / " + lastName2);
        } else {
            System.out.println(lastName1 + " / " + lastName2 + " / ...");
        }
    }
}
