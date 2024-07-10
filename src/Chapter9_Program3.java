import java.util.Scanner;

public class Chapter9_Program3 {
    public static double activityCalories(String activity, int duration) {

        return switch (activity) {
            case "sit" -> duration * 1.4;
            case "walk" -> duration * 5.4;
            case "bike" -> duration * 6.8;
            case "swim" -> duration * 8.7;
            case "run" -> duration * 13.0;
            default -> -1;
        };
        // Old JVM implementation
//        switch (activity) {
//            case "sit":
//                return duration * 1.4;
//            case "walk":
//                return duration * 5.4;
//            case "bike":
//                return duration * 6.8;
//            case "swim":
//                return duration * 8.7;
//            case "run":
//                return duration * 13.0;
//            default:
//                return -1;
//        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userMinutes;
        String userActivity;

        userActivity = scanner.next();
        userMinutes = scanner.nextInt();

        System.out.println(activityCalories(userActivity, userMinutes));
    }
}
