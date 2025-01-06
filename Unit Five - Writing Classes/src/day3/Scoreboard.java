package day3;

public class Scoreboard {
    private String team1;
    private String team2;
    private int score1;
    private int score2;
    private boolean activeTeam;

    public Scoreboard(String team1, String team2) {
        this.team1 = team1;
        this.team2 = team2;
        activeTeam = true;
        score1 = 0;
        score2 = 0;
    }

    public void recordPlay(int points) {
        if (points == 0) {
            activeTeam = !activeTeam;
        } else {
            if (activeTeam) {
                score1 += points;
            } else {
                score2 += points;
            }
        }
    }

    public String getScore() {
        if (activeTeam) {
            return score1 + "-" + score2 + "-" + team1;
        } else {
            return score1 + "-" + score2 + "-" + team2;
        }
    }
}
