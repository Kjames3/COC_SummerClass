public class Team {
    private String teamName;
    private int wins;
    private int losses;

    public void setName(String teamName) {
        this.teamName = teamName;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public String getName() {
        return teamName;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public double getWinPercentage() {
        return (double) wins / (wins + losses);
    }

    public void printStanding() {
        System.out.printf("Win percentage: %.2f\n", getWinPercentage());
        if (getWinPercentage() < 0.50) {
            System.out.printf("Team %s has a losing average.\n", getName());
        } else if (getWinPercentage() >= 0.5) {
            System.out.printf("Congratulations, Team %s has a winning average!\n", getName());
        }
    }
}
