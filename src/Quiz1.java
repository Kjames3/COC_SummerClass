import java.util.Scanner;

public class Quiz1 {
    public static void sum(int x, int y) {
        int sum = 0;
        for (int i = x; i < y; i++) {
            sum += i;
            System.out.printf("%3d", sum);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String s = "Go";
//        int counter = 0;
//        while ((!s.equals("q")) && (!s.equals("Q"))) {
//            System.out.print("In loop");
//            s = scan.next();
//            counter++;
//            System.out.println("Counter: " + counter);
//        }

       int y = 6;
       int x = (1/ 2) * y + 8;

       System.out.println("x: " + x);

        double num1 = 1.0;
        double num2 = -1.0;
        System.out.println(32.0 +(num1 / (num2 + 1.0)));
        //Scanner scan = new Scanner(System.in);
//        while (true) {
//            System.out.print("Enter the activity");
//            activity = scanner.nextLine();
//            if (activity == "done") {
//                break;
//            }
//            System.out.print("Enter the number of minutes spent on the activity");
//            duration = scanner.nextDouble();
//            scanner.nextLine();
//
//            int factor = 0;
//            switch (activity) {
//                case "sit":
//                    factor = 1;
//                case "walk":
//                    factor = 5.5;
//                case "run":
//                    factor = 13;
//            }
//            totalCalories += duration * factor;
//        }
//        System.out.printf("Total calories: %.2f", totalCalories);
//        String s = "Go";
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        boolean YYYY = true;
//        int previous = 0;
//        for (int i = 0; i<input.length(); i++) {
//            int current = (int) input.charAt(i);
//            if(current < previous) {
//                YYYY = false;
//                break;
//            }
//            previous = current;
//            System.out.println("previous: "+previous);
//            System.out.println("current: "+current);
//            System.out.println("YYYY: "+YYYY);

    }
}