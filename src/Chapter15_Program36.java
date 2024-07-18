import java.util.Scanner;

public class Chapter15_Program36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int highwayNumber = scanner.nextInt();
        boolean isPrimary = true;
        boolean isAuxiliary = false;
        boolean isValid = true;
        boolean isEven = false;
        int servesPrimary = 0;

        // Check if highway number is valid
        if (!(highwayNumber > 0 && highwayNumber < 1000) || highwayNumber % 100 == 0) {
            isValid = false;
        }

        // Check if highway is primary or auxiliary
        if (highwayNumber < 100) {
            if (highwayNumber % 5 == 0) {
                isPrimary = true;
            }
            isEven = highwayNumber % 2 == 0;
        } else if (highwayNumber > 100 && highwayNumber < 1000) {
            isPrimary = false;
            isAuxiliary = true;
            servesPrimary = highwayNumber % 100;
            if (servesPrimary < 1 || servesPrimary > 100) {
                isValid = false;
            }
            isEven = highwayNumber % 2 == 0;
        }

        // Print the results
        if (isValid) {
            if (isPrimary) {
                System.out.printf("I-%d is primary, going %s\n", highwayNumber, (isEven ? "east/west." : "north/south."));
            } else if (isAuxiliary) {
                System.out.printf("I-%d is auxiliary, serving I-%d, going %s\n", highwayNumber, servesPrimary, (isEven ? "east/west." : "north/south."));
            }
        } else {
            System.out.println(highwayNumber + " is not a valid interstate highway number.");
        }

        scanner.close();
    }
}
