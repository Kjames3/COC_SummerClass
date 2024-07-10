import java.util.Scanner;
import java.util.ArrayList;
import java.util.Objects;

public class Chapter5_Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String inputLine = scanner.nextLine();

        System.out.println("You entered: " + inputLine);

        if(inputLine.contains("BFF")) {
            System.out.println("BFF: best friends forever");
        }
        if (inputLine.contains("IDK")) {
            System.out.println("IDK: I don't know");
        }
        if (inputLine.contains("JK")) {
            System.out.println("JK: just kidding");
        }
        if (inputLine.contains("TMI")) {
            System.out.println("TMI: too much information");
        }
        if (inputLine.contains("TTYL")) {
            System.out.println("TTYL: talk to you later");
        }

    }
}
