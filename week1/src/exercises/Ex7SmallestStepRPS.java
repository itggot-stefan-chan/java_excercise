package exercises;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 * Applying "smallest step tactics" to Rock, paper, scissor game.
 * See https://en.wikipedia.org/wiki/Rock%E2%80%93paper%E2%80%93scissors
 *
 * Rules:
 *
 *       -----------  Beats -------------
 *       |                              |
 *       V                              |
 *      Rock (1) --> Scissors (2) --> Paper (3)
 *
 * See:
 * - SmallestStepNim
 */
public class Ex7SmallestStepRPS {

    public static void main(String[] args) {
        new Ex7SmallestStepRPS().program();
    }

    final Random rand = new Random();
    final Scanner sc = new Scanner(in);

    void program() {

        int maxRounds = 5;
        int human;          // Outcome for player
        int computer;       // Outcome for computer
        int result;         // Result for this round
        int round = 0;      // Number of rounds
        int total = 0;      // Final result after all rounds
        String winner = "";


        out.println("Welcome to Rock, Paper and Scissors");

        // Write code for game here
        /*computer = (int) (Math.random() * 3 + 1);
        out.print("Select 1, 2 or 3 (for R, P or S)");
        human = sc.nextInt();
        out.println("Computer choose: " + computer);
        out.println(whoWon(human, computer));
        */
        while(round <= maxRounds || total == 3) {
            computer = (int) (Math.random() * 3 + 1);
            out.print("Select 1, 2 or 3 (for R, P or S)");
            human = sc.nextInt();
            out.println("Computer choose: " + computer);
            winner = whoWon(human, computer);
            if(winner == "None") {
                out.println("A draw");
            }
            else if (winner == "Human") {
                out.println("You won");
                total++;
            }
            else if (winner == "Computer") {
                out.println("Computer Won");
                total--;
            }
            round++;
        }


        out.println("Game over! ");
        if (total == 0) {
            out.println("Draw");
        } else if (total > 0) {
            out.println("Human won.");
        } else {
            out.println("Computer won.");
        }
    }
    String whoWon(int human, int computer) {
        String who = "";
        if (human == computer) {
            who = "None";
        }
        else if(human == (computer - 1) && computer != 1) {
            who = "Human";
        }
        else if(human == (computer + 1) && computer != 3) {
            who = "Computer";
            }
        else if(human == 1 && computer == 3) {
            who = "Computer";
        }
        else if (human == 3 && computer == 1) {
            who = "Human";
        }
        return who;
    }
}
