import java.util.Scanner;

public class Chapter6_Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char character = scanner.next().charAt(0);
        String inputText = scanner.nextLine();
        int counter = 0;

        for (int i = 0; i < inputText.length(); i++) {
            if (inputText.charAt(i) == character) {
                counter++;
            }
        }
        if (counter <= 1 ) {
            System.out.println(counter + " " + character);
        } else {
            System.out.println(counter + " " + character + "'s");
        }
    }
}
