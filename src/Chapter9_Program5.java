import java.util.Scanner;

public class Chapter9_Program5 {
    public static char digitToChar(int digit) {
        return (char) (digit + '0'); // 0 has no ascii value
    }

    public static String numToStringWithCommas(int userNum) {
        StringBuilder result = new StringBuilder();
        int count = 0;

        if (userNum == 0) {
            return "0";
        }

        while (userNum > 0) {
            int digit = userNum % 10;
            result.insert(0, digitToChar(digit));
            userNum /= 10;
            count++;
            if (count % 3 == 0 && userNum > 0) {
                result.insert(0, ',');
                count = 0;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        System.out.println(numToStringWithCommas(userNum));
    }
}
