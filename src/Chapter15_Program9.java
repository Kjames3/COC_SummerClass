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
            }
            else {
                chapList[i] = false;
            }
        }

        // Print the selected chapters with shorthand for ranges
        if (isChapterSelected) {
            int startRange = -1;
            for (i = 0; i <= 15; i++) {
                if (chapList[i]) {
                    if (startRange == -1) {
                        startRange = i;
                    }
                } else {
                    if (startRange != -1) {
                        if (i - startRange == 1) {
                            System.out.print(startRange + " ");
                        } else if (i - startRange == 2) {
                            System.out.print(startRange + " " + (startRange + 1) + " ");
                        } else {
                            System.out.print(startRange + "-" + (i - 1) + " ");
                        }
                        startRange = -1;
                    }
                }
            }

            // Print the last range if any
            if (startRange != -1) {
                if (15 - startRange == 1) {
                    System.out.print(startRange + " ");
                } else if (15 - startRange == 2) {
                    System.out.print(startRange + " " + (startRange + 1) + " ");
                } else {
                    System.out.print(startRange + "-" + 15 + " ");
                }
            }

            System.out.println();
        } else {
            System.out.println("None");
        }
    }
}
