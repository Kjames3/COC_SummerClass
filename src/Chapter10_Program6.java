import java.util.Scanner;

public class Chapter10_Program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wordCount = scanner.nextInt();
        String[] lines = new String[12];
        char searchCharacter;

        for (int i = 0; i < wordCount; i++) {
            lines[i] = scanner.next();
        }
        searchCharacter = scanner.next().charAt(0);
        for (int i = 0; i < wordCount; i++) {
            if (lines[i].contains(String.valueOf(searchCharacter))) {
                System.out.print(lines[i] + ",");
            }
        }
        System.out.println();
    }
}
