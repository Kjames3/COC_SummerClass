public class Artwork {
    //private variables
    private String title;
    private int yearCreated;
    private Artist artist;

    // Default constructor
    public Artwork() {
        this.title = "unknown";
        this.yearCreated = -1;
        this.artist = new Artist();
    }

    //Regular constructor
    public Artwork(String title, int yearCreated, Artist artist) {
        this.title = title;
        this.yearCreated = yearCreated;
        this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getYearCreated() {
        return yearCreated;
    }
    //getInfo and printInfo methods
    public void printInfo() {
        artist.printInfo();
        System.out.println("Title: " + title + ", " + yearCreated);
    }
}
