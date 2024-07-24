import java.util.Scanner;

public class Chapter15_Program60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] userStrings = new String[20];
        int[] userNumbers = new int[20];
        int i = 0;

        while (true) {
            String inputString = scanner.next();
            if (inputString.equals("quit")) {
                break;
            }
            userStrings[i] = inputString;
            userNumbers[i] = scanner.nextInt();
            i++;
        }
        scanner.close();

        for (int j = 0; j < i; j++) {
            System.out.println("Eating " + userNumbers[j] + " " + userStrings[j] + " a day keeps you happy and healthy.");
        }
    }
}
