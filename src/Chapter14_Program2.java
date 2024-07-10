import java.util.Scanner;

public class Chapter14_Program2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] names = {"Ryley", "Edan", "Reagan",
                          "Henry", "Caius", "Jane",
                          "Guto", "Sonya", "Tyrese",
                          "Johnny" };
        int index = scan.nextInt();

        try {
            System.out.println("Name: " + names[index]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.printf("Exception! Index %d out of bounds for length 10\n", index);
            if (index < 0) {
                index = 0;
            } else {
                index = 9;
            }
            System.out.printf("The closest name is %s\n", names[index]);
        }

        scan.close();
    }
}
