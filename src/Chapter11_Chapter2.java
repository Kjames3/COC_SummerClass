import java.util.*;

public class Chapter11_Chapter2 {
    public static int[] reverse(int[] arr) {
        int[] reverseArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverseArr[i] = arr[arr.length - 1 - i];
        }
        return reverseArr;
    }

    public static void main(String[] args) {
        int i = 0;
        int[] intArr = {2, 4, 6};
        int[] revArr = reverse(intArr);

        System.out.print("Reversed arryay: [");
        for (i = 0;i < revArr.length - 1; i++) {
            System.out.print(revArr[i] + ", ");
        }
        System.out.println(revArr[i] + "]");
    }
}
