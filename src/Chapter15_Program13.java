import java.util.Scanner;

public class Chapter15_Program13 {
    public static int getWordFrequency(String[] wordList, int numberOfWords, String currentWord) {
        int frequency = 0;

        // Determine the frequency of words in array
        for (int i = 0; i < numberOfWords; i++) {
            if (wordList[i].equalsIgnoreCase(currentWord)) {
                frequency++;
            }
        }
        return frequency;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables
        int numberOfWords = scanner.nextInt();
        String[] words = new String[numberOfWords];

        // Input words
        for (int i = 0; i < numberOfWords; i++) {
            words[i] = scanner.next();
        }

        // Find Number of each word
        for (int i = 0; i < numberOfWords; i++) {
            System.out.println(words[i] + ": " + getWordFrequency(words, numberOfWords, words[i]));
        }
    }
}
