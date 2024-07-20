import java.util.Scanner;

public class Chapter15_Program40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstWord = scan.next();
        String secondWord = scan.next();

        if (firstWord.length() > secondWord.length()) {
            System.out.println(firstWord + " is longer than " + secondWord);
        } else if (firstWord.length() < secondWord.length()) {
            System.out.println(secondWord + " is longer than " + firstWord);
        } else {
            System.out.println(firstWord + " and " + secondWord + " have the same length");
        }
        scan.close();
    }
}
