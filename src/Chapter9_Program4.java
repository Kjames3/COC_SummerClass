import java.util.Scanner;

public class Chapter9_Program4 {
    public static int findNextCharInString(String inputString, int index, char searchChar) {
        for (int i = index; i < inputString.length(); i++) {
            if (inputString.charAt(i) == searchChar) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        int startIndex = scanner.nextInt();
        char searchChar = scanner.next().charAt(0);

        System.out.println(findNextCharInString(inputString, startIndex, searchChar));
    }

}
