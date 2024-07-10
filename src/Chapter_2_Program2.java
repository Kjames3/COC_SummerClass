import java.util.Scanner;

public class Chapter_2_Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age;
        int weight;
        int heartRate;
        int time;

        age = scanner.nextInt();
        weight = scanner.nextInt();
        heartRate = scanner.nextInt();
        time = scanner.nextInt();

        double calories = (((age * 0.2757)+(weight*0.03295)+(heartRate*1.0781 - 75.4991)) * time) / 8.368;

        System.out.print("Calories: ");
        System.out.printf("%.2f", calories);
        System.out.println(" calories");
    }
}
