import java.util.Scanner;

public class Chapter15_Program43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Declare variables
        String userCaption = scan.nextLine();

        // Check to see if input contains a ! or ? character
        if (!userCaption.contains("!") && !userCaption.contains("?")) {
            if (!userCaption.endsWith(".")) {
                userCaption = userCaption.substring(0, userCaption.length()) + ".";
            } else {
                if (userCaption.length() > 1 && !userCaption.endsWith("..")) {
                    if (userCaption.length() > 2 && userCaption.endsWith("...")) {

                    } else {
                        userCaption = userCaption.substring(0, userCaption.length() - 1);
                    }
                }
            }
        }

        // Print the modified caption
        System.out.println(userCaption);

        // Close the scanner
        scan.close();
    }
}
