
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner stringSc = new Scanner(System.in);
        Scanner intSc = new Scanner(System.in);

        System.out.println("What's your name?");
        Player p = new Player(stringSc.nextLine(), 0, 0);
        System.out.println("\033[2J");

        
        int difficulty = 0;
        Game game = new Game();

        game.instructions();

        boolean replay = true;
        while (replay) {
            boolean validInput = false;
            while (!validInput) {
                System.out.println("\nChoose a difficulty:");
                System.out.println("[1] Easy\n[2] Medium\n[3] Impossible!!");
                difficulty = intSc.nextInt();

                if (difficulty == 1 || difficulty == 2 || difficulty == 3) {
                    validInput = true;
                    game.setDifficulty(difficulty);
                    p.setScore(game.play());
                    p.tryBestScore();
                    System.out.println(p.getName() + "'s score was: " + p.getScore());
                    System.out.println(p.getName() + "'s best score is: " + p.getBestScore());

                } else System.out.println("\nInvalid input. Try again.");
            }

            
            String answer = "";
            validInput = false;
            while (!validInput) {
                System.out.println("\nDo you want to play again?");
                System.out.println("[Y] Yes\n[N] No");
                answer = stringSc.nextLine();
                if (answer.toUpperCase().equals("Y")) {
                    System.out.println("\033[2J");
                    validInput = true;
                }
                else if (answer.toUpperCase().equals("N")) {
                    System.out.println("\nThanks for playing!");
                    validInput = true;
                    replay = false;
                }
                else System.out.println("\nInvalid input. Try again.");
            }
        }
        
        stringSc.close();
        intSc.close();
        
    }

}