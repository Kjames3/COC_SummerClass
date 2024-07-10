import java.util.Scanner;

public class Chapter11_Program4 {
    public static void menuMethod() {
        System.out.println();
        System.out.println("MENU");
        System.out.println("u - Update player rating");
        System.out.println("a - Output players above a rating");
        System.out.println("r - Replace player");
        System.out.println("o - Output roster");
        System.out.println("q - Quit");
        System.out.println();
        System.out.println("Choose an option:");
    }

    public static void outputRoster(int[] players, int[] playerRanks) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + " -- Jersey number: " + players[i] + ", Rating: " + playerRanks[i]);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] jerseyNumber = new int[5];
        int[] playerRank = new int[5];
        char choosenCharacter;

        for (int i = 1; i < jerseyNumber.length + 1; i++) {
            System.out.println("Enter player" + i + "'s jersey number:");
            jerseyNumber[i - 1] = scanner.nextInt();
            System.out.println("Enter player" + i + "'s ranking:");
            playerRank[i - 1] = scanner.nextInt();
            System.out.println();
        }
        System.out.println("ROSTER");
        outputRoster(jerseyNumber, playerRank);

        while (true) {
            menuMethod();

            choosenCharacter = scanner.next().charAt(0);
            switch(choosenCharacter) {
                case 'u':
                    System.out.println("Enter a jersey number:");
                    int updatePlayerNumber = scanner.nextInt();
                    int updatePlayerIndex = -1;

                    // Find the index of the jersey number in the jerseyNumber array
                    for (int i = 0; i < jerseyNumber.length; i++) {
                        if (jerseyNumber[i] == updatePlayerNumber) {
                            updatePlayerIndex = i;
                            break;
                        }
                    }

                    // If the jersey number is found, update the corresponding player rank
                    if (updatePlayerIndex != -1) {
                        System.out.println("Enter new rating:");
                        int updateRating = scanner.nextInt();
                        playerRank[updatePlayerIndex] = updateRating;
                    } else {
                        System.out.println("Jersey number not found.");
                    }
                    break;
                case 'a':
                    System.out.println("Enter a rating:");
                    int aboveRating = scanner.nextInt();
                    System.out.println();
                    System.out.println("ABOVE:");
                    for (int i = 0; i < playerRank.length; i++) {
                        if (playerRank[i] > aboveRating) {
                            System.out.println("Player " + (i + 1) + " -- Jersey number: " + jerseyNumber[i] + ", Rating: " + playerRank[i]);
                        }
                    }
                    break;
                case 'r':
                    System.out.println("Enter a jersey number:");
                    int replacePlayerNumber = scanner.nextInt();
                    int replacePlayerIndex = -1;

                    // Find the index of the jersey number in the jerseyNumber array
                    for (int i = 0; i < jerseyNumber.length; i++) {
                        if (jerseyNumber[i] == replacePlayerNumber) {
                            replacePlayerIndex = i;
                            break;
                        }
                    }

                    // If the jersey number is found, prompt the user to enter the new jersey number and rank
                    if (replacePlayerIndex!= -1) {
                        System.out.println("Enter new jersey number:");
                        int newJerseyNumber = scanner.nextInt();
                        System.out.println("Enter new rating:");
                        int newRating = scanner.nextInt();

                        jerseyNumber[replacePlayerIndex] = newJerseyNumber;
                        playerRank[replacePlayerIndex] = newRating;
                    }
                    break;
                case 'o':
                    outputRoster(jerseyNumber, playerRank);
                    break;
                case 'q':
                    System.exit(0);
                    break;
            }
        }
    }
}
