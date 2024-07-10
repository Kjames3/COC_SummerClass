public class Quiz1 {
    public static void sum(int x, int y) {
        int sum = 0;
        for (int i = x; i < y; i++) {
            sum += i;
            System.out.printf("%3d", sum);
        }
    }

    public static void main(String[] args) {
        sum(1, 12);
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