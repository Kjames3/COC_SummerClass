import java.util.Scanner;

public class Chapter4_Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = scanner.nextInt();
        int par = scanner.nextInt();

        if (par < 3 || par > 5) {
            System.out.println("Par " + par + " in " + score + " strokes is Error");
        } else if (score == par - 1){
            System.out.println("Par " + par + " in " + score + " strokes is Birdie");
        } else if (score == par - 2){
            System.out.println("Par " + par + " in " + score + " strokes is Eagle");
        } else if (score == par + 1){
            System.out.println("Par " + par + " in " + score + " strokes is Bogey");
        } else if (score == par) {
            System.out.println("Par " + par + " in " + score + " strokes is Par");
        } else {
            System.out.println("Par " + par + " in " + score + " strokes is Error");
        }
    }
}
