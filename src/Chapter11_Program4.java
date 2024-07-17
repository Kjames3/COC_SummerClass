import java.util.Scanner;

public class Chapter11_Program4 {
    public static void printMenu() {
        System.out.println("\nMENU");
        System.out.println("u - Update player rating");
        System.out.println("a - Output players above a rating");
        System.out.println("r - Replace player");
        System.out.println("o - Output roster");
        System.out.println("q - Quit");
        System.out.println();
        System.out.println("Choose an option:");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] jerseyNumbers = new int[5];
        int[] ratings = new int[5];

        // Get the player numbers and ratings
        for (int i = 0; i < 5; ++i) {
            System.out.print("Enter player " + (i + 1) + "'s jersey number:");
            jerseyNumbers[i] = scan.nextInt();
            System.out.println("Enter player " + (i + 1) + "'s rating:");
            ratings[i] = scan.nextInt();
        }

        // Print the Rosters and ratings
        System.out.println("ROSTER");
        for (int i = 0; i < 5; ++i) {
            System.out.println("Player " + (i + 1) + " -- Jersey number: " + jerseyNumbers[i] + ", Rating: " + ratings[i]);
        }


        char menuOption;
        do {
            printMenu();
            menuOption = scan.next().charAt(0);

            switch (menuOption) {
                case 'o':
                    System.out.println("ROSTER");
                    for (int i = 0; i < 5; ++i) {
                        System.out.println("Player " + (i + 1) + " -- Jersey number: " + jerseyNumbers[i] + ", Rating: " + ratings[i]);
                    }
                    break;

                case 'u':
                    System.out.println("Enter a jersey number:");
                    int jersey = scan.nextInt();
                    System.out.println("Enter a new rating for player:");
                    int rating = scan.nextInt();
                    for (int i = 0; i < 5; ++i) {
                        if (jerseyNumbers[i] == jersey) {
                            ratings[i] = rating;
                        }
                    }
                    break;

                case 'a':
                    System.out.println("Enter a rating:");
                    int ratingThreshold = scan.nextInt();
                    System.out.println("ABOVE " + ratingThreshold);
                    for (int i = 0; i < 5; ++i) {
                        if (ratings[i] > ratingThreshold) {
                            System.out.println("Player " + (i + 1) + " -- Jersey number: " + jerseyNumbers[i] + ", Rating: " + ratings[i]);
                        }
                    }
                    break;

                case 'r':
                    System.out.println("Enter a jersey number:");
                    int oldJersey = scan.nextInt();
                    int index = -1;
                    // Check if oldJersey is in the list
                    for (int i = 0; i < jerseyNumbers.length; ++i) {
                        if (jerseyNumbers[i] == oldJersey) {
                            index = i;
                            break;
                        }
                    }
                    if (index != -1) {
                        System.out.println("Enter a new jersey number:");
                        int newJersey = scan.nextInt();
                        System.out.println("Enter a rating for the new player:");
                        int newRating = scan.nextInt();
                        jerseyNumbers[index] = newJersey;
                        ratings[index] = newRating;
                    } //else {
//                        System.out.println("Jersey number " + oldJersey + " not found in the roster.");
//                    }
                    break;
            }
        } while (menuOption != 'q');

        scan.close();
    }
}
