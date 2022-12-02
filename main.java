
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What's your name?");
        Player p = new Player(sc.nextLine(), 0, 0);
        
        int difficulty = 0;
        Game game = new Game();

        boolean replay = false;
        while (!replay) {
            boolean validInput = false;
            while (!validInput) {
                System.out.println("Welcome " + p.getName() + "! Choose a difficulty:");
                System.out.println("[1] Easy\n[2] Medium\n[3] Impossible!!");
                difficulty = sc.nextInt();

                if (difficulty == 1 || difficulty == 2 || difficulty == 3) {
                    validInput = true;
                    game = new Game(difficulty);
                } else System.out.println("Invalid input. Try again.");
            }

            System.out.println("Do you want to play again?");
            System.out.println("[Y] Yes\n[N] No");
        }
        
        sc.close();
        
    }

}