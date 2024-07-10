public class Artist {
    private String artistName;
    private int birthYear;
    private int deathYear;

    // Default constructor
    public Artist() {
        this.artistName = "Unknown";
        this.birthYear = -1;
        this.deathYear = -1;
    }
    // Regular constructor
    public Artist(String artistName, int birthYear, int deathYear) {
        this.artistName = artistName;
        this.birthYear = birthYear;
        this.deathYear = deathYear;
    }

    public void setName() {
        this.artistName = artistName;
    }

    public void setBirthYear() {
        this.birthYear = birthYear;
    }

    public void setDeathYear() {
        this.deathYear = deathYear;
    }

    public String getName() {
        return artistName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getDeathYear() {
        return deathYear;
    }

    public void printInfo() {
        System.out.print("Artist: " + artistName + " ");
        if (birthYear >= 0 && deathYear >= 0) {
            System.out.println("(" + birthYear + " to " + deathYear + ")");
        } else if (birthYear >= 0 && deathYear < 0) {
            System.out.println("(" + birthYear + " to present)");
        } else {
            System.out.println("(unknown)");
        }
    }
}
