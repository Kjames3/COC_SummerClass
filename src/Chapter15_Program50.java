import java.util.Scanner;

public class Chapter15_Program50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare/Initialize variables
        String plateNumber = scanner.nextLine();
        String nextPlateNumber = generateNextPlateNumber(plateNumber);

        System.out.println(nextPlateNumber);

    }

    private static String generateNextPlateNumber(String plateNumber) {
        char[] plateCharacters = plateNumber.toCharArray();
        boolean carry = true;

        // Iterate through the plate number from right to left
        for (int i = plateCharacters.length - 1; i >= 0 && carry; i--) {
            if (Character.isDigit(plateCharacters[i])) {
                if (plateCharacters[i] == '9') {
                    plateCharacters[i] = '0';
                } else {
                    plateCharacters[i]++;
                    carry = false;
                }
            } else if (Character.isLetter(plateCharacters[i])) {
                if (plateCharacters[i] == 'Z') {
                    plateCharacters[i] = 'A';
                } else {
                    plateCharacters[i]++;
                    carry = false;
                }
            }
        }
        if (carry) {
            StringBuilder sb = new StringBuilder();
            sb.append("AAA000");
            //sb.append(plateNumber.substring(3));
            return sb.toString();
        } else {
            return new String(plateCharacters);
        }
    }
}
