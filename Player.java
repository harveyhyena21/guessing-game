public class Player {
    private String name;
    private int bestScore;
    private int score;


    //constructors
    public Player() {
        name = "Player";
        bestScore = 0;
        score = 0;
    }

    public Player(String name, int bestScore, int score) {
       this.name = name;
       this.bestScore = bestScore;
       this.score = score;
    }

    //assessors
    public String getName() {
        return name;
    }

    public int getBestScore() {
        return bestScore;
    }

    public int getScore() {
        return score;
    }

    //mutators
    public void setName(String name) {
        this.name = name;
    }

    public void tryBestScore() {
        if (score > bestScore) bestScore = score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
