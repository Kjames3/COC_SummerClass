import java.util.Scanner;

public class Chapter8_Program3 {
    public static int calcNumCharacters(String userString, char userChar) {
        int count = 0;
        for (int i = 0; i < userString.length(); i++) {
            if (userString.charAt(i) == userChar) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char userChar = scanner.next().charAt(0);
        String userString = scanner.nextLine();

        int numCharacters = calcNumCharacters(userString, userChar);
        if (numCharacters == 1) {
            System.out.println(numCharacters + " " + userChar);
        } else {
            System.out.println(numCharacters + " " + userChar + "'s");
        }
    }
}
