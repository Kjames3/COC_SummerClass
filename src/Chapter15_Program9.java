import java.util.Scanner;

public class Chapter15_Program9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean[] chapList = new boolean[16]; // Valid chapters are 1-15. 1 means include, 0 exclude. Element 0 unused.
        int includeChapter;
        boolean isChapterSelected = false;
        int i, j;

        // Get the chapter selections
        for (i = 1; i <= 15; ++i) {
            includeChapter = scan.nextInt();
            if (includeChapter==1) {
                chapList[i] = true;
                isChapterSelected = true;
            }
            else {
                chapList[i] = false;
            }
        }

        // Print the selected chapters with shorthand for ranges
        if (isChapterSelected) {
            int startRange = -1;
            for (i = 1; i <= 15; i++) {
                if (chapList[i]) {
                    if (startRange == -1) {
                        startRange = i;
                    }
                    // Check if it's the end of a range or a single character
                    if (i == 15 || chapList[i + 1]) {
                        if (startRange == i) {
                            System.out.print(startRange + " ");
                        } else {
                            System.out.print(startRange + "-" + i + " ");
                        }
                        startRange = -1;
                    }
                }
            }
            System.out.println();

        } else {
            System.out.println("None ");
        }
    }
}
