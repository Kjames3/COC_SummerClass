import java.util.Scanner;

public class Chapter3_Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long phoneNumber = scanner.nextLong();

        /*String number = Long.toString(phoneNumber);

        String lastNumbers = number.substring(number.length() - 4);
        String middleNumbers = number.substring(3, 6);
        String firstNumbers = number.substring(0, 3);


//        System.out.println(lastNumbers);
//        System.out.println(middleNumbers);
//        System.out.println(firstNumbers);

        System.out.println("(" + firstNumbers + ") " + middleNumbers + "-" + lastNumbers);*/

        long lastNumbers = phoneNumber % 10000;
        long middleNumbers = (phoneNumber / 10000) % 1000;
        long firstNumbers = phoneNumber / 10000000;

//        System.out.println(lastNumbers);
//        System.out.println(middeleNumbers);
//        System.out.println(firstNumbers);
        System.out.println("(" + firstNumbers + ") " + middleNumbers + "-" + lastNumbers);




    }
}
