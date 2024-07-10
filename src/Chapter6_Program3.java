import java.util.Objects;
import java.util.Scanner;

public class Chapter6_Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();

        String result = inputText.replaceAll("[^a-zA-Z]", "");

        System.out.println(result);
    }
}
