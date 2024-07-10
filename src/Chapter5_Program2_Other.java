import java.util.Scanner;

public class Chapter5_Program2_Other {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String inputString = scanner.nextLine();
        System.out.println("You entnered: " + inputString);
        System.out.println();

        String[][] abbreviations = {
                {"BFF", "best friend forever"},
                {"IDK", "I don't know"},
                {"JK", "just kidding"},
                {"TMI", "too much information"},
                {"TTYL", "talk to you later"}
        };

        for (String[] abbr : abbreviations) {
            if (inputString.contains(abbr[0])) {
                System.out.println("Replaced \"" + abbr[0] + "\" with \"" + abbr[1] + "\".");
                inputString = inputString.replace(abbr[0], abbr[1]);
            }
        }

        System.out.println("Expanded: " + inputString);

    }
}
