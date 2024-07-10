import java.util.Scanner;

public class Chapter12_Program5  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userTitle, userArtistName;
        int yearCreated, userBirthYear, userDeathYear;

        userArtistName = scanner.nextLine();
        userBirthYear = scanner.nextInt();
        scanner.nextLine();
        userDeathYear = scanner.nextInt();
        scanner.nextLine();
        userTitle = scanner.nextLine();
        yearCreated = scanner.nextInt();

        Artist userArtist = new Artist(userArtistName, userBirthYear, userDeathYear);

        Artwork newArtwork = new Artwork(userTitle, yearCreated, userArtist);

        newArtwork.printInfo();
    }
}
