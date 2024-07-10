import java.util.Scanner;

public class OutputWithVars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNum;

        System.out.print("Enter a number: ");
        userNum = scanner.nextInt();

        int userNumSquared = userNum * userNum;
        int userNumCubed = userNumSquared * userNum;

        System.out.println("You entered: " + userNum);
        System.out.println(userNum + " squared is: " + userNumSquared);
        System.out.println("And " + userNum + " cubed is: " + userNumCubed);

        System.out.print("Enter a new number: ");
        int newNum = scanner.nextInt();

        int addNums = userNum + newNum;
        int multNums = userNum * newNum;

        System.out.println(userNum + " + " + newNum + " is " + addNums);
        System.out.println(userNum + " * " + newNum + " is " + multNums);

    }
}
