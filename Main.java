
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What's your name?");
        Player p = new Player(sc.nextLine(), 0, 0);
        System.out.println("\033[2J");
        
        int difficulty = 0;
        Game game = new Game();

        boolean replay = true;
        while (replay) {
            boolean validInput = false;
            while (!validInput) {
                System.out.println("Welcome " + p.getName() + "! Choose a difficulty:");
                System.out.print("[1] Easy\n[2] Medium\n[3] Impossible!!");
                difficulty = sc.nextInt();
                System.out.println(difficulty);

                if (difficulty == 1 || difficulty == 2 || difficulty == 3) {
                    validInput = true;
                    game.setDifficulty(difficulty);
                } else System.out.println("\nInvalid input. Try again.");
            }

            
            String answer = "";
            validInput = false;
            while (!validInput) {
                System.out.println("\nDo you want to play again?");
                System.out.println("[Y] Yes\n[N] No");
                answer = sc.nextLine();
                if (answer.equals("Y")) validInput = true;
                else if (answer.equals("N")) {
                    System.out.println("\nThanks for playing!");
                    validInput = true;
                    replay = false;
                }
                else System.out.println("\nInvalid input. Try again.");
            }
        }
        
        sc.close();
        
    }

}