import java.util.Scanner;

public class Chapter11_Program1 {
    public static int getWordFrequency(String[] wordList, int listSize, String currWord) {
        int frequency = 0;
        for (int i = 0; i < listSize; i++) {
            if (wordList[i].equalsIgnoreCase(currWord)) {
                frequency++;
            }
        }
        return frequency;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int loopCount = scanner.nextInt();
        String[] userInput = new String[20];

        for (int i = 0; i < loopCount; i++) {
            userInput[i] = scanner.next();
        }
        for (int i = 0; i < loopCount; i++) {
            System.out.println(userInput[i] + " " + getWordFrequency(userInput, loopCount, userInput[i]));
        }
    }
}
