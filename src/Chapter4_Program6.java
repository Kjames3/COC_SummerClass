import java.util.Scanner;
import java.util.ArrayList;

public class Chapter4_Program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an abbreviation: ");
        String input = scanner.next();
        ArrayList<String> abbList = new ArrayList<String>();
        abbList.add("LOL");
        abbList.add("BFF");
        abbList.add("IMHO");
        abbList.add("TMI");
        abbList.add("IDK");

        if (abbList.contains(input)) {
            if (input.equalsIgnoreCase("LOL")) {
                System.out.println("laughing out loud");
            } else if (input.equalsIgnoreCase("BFF")) {
                System.out.println("best friends forever");
            } else if (input.equalsIgnoreCase("IMHO")) {
                System.out.println("in my humble opinion");
            } else if (input.equalsIgnoreCase("TMI")) {
                System.out.println("too much information");
            } else if (input.equalsIgnoreCase("IDK")) {
                System.out.println("I don't know");
            }
        } else {
            System.out.println("Unknown");
        }

    }
}
