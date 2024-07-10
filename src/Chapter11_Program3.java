import java.util.Scanner;

public class Chapter11_Program3 {
    public static void sortArray(int[] myArr, int arrSize) {
        for (int i = 0; i < arrSize - 1; i++) {
            for (int j = 0; j < arrSize - i - 1; j++) {
                if (myArr[j] < myArr[j + 1]) {
                    int temp = myArr[j];
                    myArr[j] = myArr[j + 1];
                    myArr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] userInput = new int[20];
        int loopCounter = scanner.nextInt();

        //Collect all the values from the user
        for (int i = 0; i < loopCounter; i++) {
            userInput[i] = scanner.nextInt();
        }

        //Sort the array using the method
        sortArray(userInput, loopCounter);

        //Print the sorted array
        for (int i = 0; i < loopCounter; i++) {
            System.out.print(userInput[i] + ",");
        }

        scanner.close();
    }
}
