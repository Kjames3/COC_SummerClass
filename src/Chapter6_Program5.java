import java.util.Scanner;
import java.util.Arrays;

public class Chapter6_Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input text
        String inputText = scanner.nextLine();

        //Done condition
        String[] doneConditon = {
                "Done",
                "done",
                "d"
        };

        //Logic to reverse the text
        while (!(Arrays.asList(doneConditon).contains(inputText))) {
            for (int i = inputText.length() - 1; i >= 0; i--) {
                System.out.print(inputText.charAt(i));
                if (i == 0) {
                    System.out.println();
                }
            }
            inputText = scanner.nextLine();

        }


    }
}
