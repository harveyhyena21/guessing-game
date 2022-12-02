public class Game {
    private String[] easy = { "a", "b", "c" };
    private String[] medium = { "a", "b", "c", "d", "e" };
    private String[] impossible = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
            "r", "s", "t", "u", "v", "w", "x", "y", "z" };
    String[] gameArray;

    public Game() {
        gameArray = easy;
    }

    public Game(int difficulty) {
        if (difficulty == 1) gameArray = easy;
        else if (difficulty == 2) gameArray = medium;
        else if (difficulty == 3) gameArray = impossible;
    }

    public void setDifficulty(int difficulty) {
        if (difficulty == 1) gameArray = easy;
        else if (difficulty == 2) gameArray = medium;
        else if (difficulty == 3) gameArray = impossible;
    }


}
