import java.util.Scanner;
import java.util.ArrayList;

public class Chapter5_Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        String bff1 = "\"BFF\"";
        String bff2 = "\"best friend forever\"";
        String idk1 = "\"IDK\"";
        String idk2 = "\"I don't know\"";
        String jk1 = "\"JK\"";
        String jk2 = "\"just kidding\"";
        String tmi1 = "\"TMI\"";
        String tmi2 = "\"too much information\"";
        String ttyl1 = "\"TTYL\"";
        String ttyl2 = "\"talk to you later\"";



        System.out.println("You entered: " + inputString);
        System.out.println();

        if(inputString.contains("BFF")) {
            System.out.println("Replaced " + bff1 + " with " + bff2);
            inputString = inputString.replaceAll(bff1, bff2);
        }
        if(inputString.contains("IDK")) {
            System.out.println("Replaced " + idk1 + " with " + idk2);
            inputString = inputString.replaceAll(idk1, idk2);
        }
        if (inputString.contains("JK")) {
            System.out.println("Replaced " + jk1 + " with " + jk2);
            inputString = inputString.replaceAll(jk1, jk2);
        }
        if (inputString.contains("TMI")) {
            System.out.println("Replaced " + tmi1 + " with " + tmi2);
            inputString = inputString.replaceAll(tmi1, tmi2);
        }
        if (inputString.contains("TTYL")) {
            System.out.println("Replaced " + ttyl1 + " with " + ttyl2);
            inputString = inputString.replaceAll(ttyl1, ttyl2);
        }
        System.out.println();
        System.out.println("Expanded: " + inputString);
    }
}
