import java.util.Scanner;

public class Chapter12_Program3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Team team = new Team();

        String name = scanner.next();
        int wins = scanner.nextInt();
        int losses = scanner.nextInt();

        team.setName(name);
        team.setWins(wins);
        team.setLosses(losses);

        team.printStanding();
    }
}

