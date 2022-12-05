import java.lang.Thread;
import java.util.Scanner;

public class Game extends InterruptedException {
    Scanner sc = new Scanner(System.in);
    private String[] easy = { "a", "b", "c" };
    private String[] medium = { "a", "b", "c", "d", "e" };
    private String[] impossible = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
            "r", "s", "t", "u", "v", "w", "x", "y", "z" };
    String[] gameArray;
    int timeBetweenLetters;
    String correctSequence;
    int score;

    public Game() {
        gameArray = easy;
        correctSequence = "";
        score = 0;
        timeBetweenLetters = 3000;
    }

    public void setDifficulty(int difficulty) {
        System.out.println("\n");
        if (difficulty == 1) {
            System.out.println("Difficulty of the game set to easy.");
            gameArray = easy;
            timeBetweenLetters = 2500;
        } else if (difficulty == 2) {
            System.out.println("Difficulty of the game set to medium.");
            gameArray = medium;
            timeBetweenLetters = 1500;
        } else if (difficulty == 3) {
            System.out.println("Difficulty of the game set to impossible.");
            gameArray = impossible;
            timeBetweenLetters = 800;
        }
    }

    public void instructions() {
        System.out.println("Welcome to the guessing game! This is how you play:");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Every round you'll be presented with a sequence of letter(s).");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("The letters will only be shown for short period of time.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("After they disappear, enter the letters as they were shown.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("If you enter them correctly, you get a point added to your score!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Good luck and have fun!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("\033[2J");
    }

    public int play() {
        correctSequence = "";
        score = 0;
        boolean correct = true;
        while (correct) {
            correctSequence += gameArray[(int) (Math.random() * (gameArray.length))];
            System.out.println("\033[2J");
            System.out.println("Enter the following sequence when the screen is cleared.");
            for (int i = 0; i < correctSequence.length(); i++) {
                System.out.print(correctSequence.substring(i, i + 1));
                try {
                    Thread.sleep(timeBetweenLetters);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
            System.out.println("\033[2J");
            if (sc.nextLine().equals(correctSequence)) {
                System.out.println("\nCorrect!");
                try {
                    Thread.sleep(2500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                score++;
                System.out.println("\033[2J");
                timeBetweenLetters -= 50;
            } else {
                correct = false;
                System.out.println("\nIncorrect. Game over.");
            }
        }
        return score;

    }

}
