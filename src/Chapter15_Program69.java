import java.util.Scanner;

public class Chapter15_Program69 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userInt = scan.nextInt();
        int counter = 0;

        scan.close();
        while (userInt != 1) {
            System.out.print(userInt + "\t");
            if (userInt % 2 == 1) {
                userInt = (userInt * 3) + 1;
            } else {
                userInt /= 2;
            }

            counter++;
            if (counter % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println(userInt + "\t");
    }
}
