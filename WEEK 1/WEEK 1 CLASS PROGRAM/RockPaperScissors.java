import java.util.*;

public class RockPaperScissors {

    static String playRound(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove))
            return "Draw";

        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
            (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
            (playerMove.equals("Scissors") && computerMove.equals("Paper")))
            return "Player Wins";

        return "Computer Wins";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] moves = {"Rock", "Paper", "Scissors"};

        int wins = 0, losses = 0, draws = 0;

        System.out.println("Round\tPlayer\t\tComputer\tResult");

        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter your move (Rock/Paper/Scissors): ");
            String player = sc.next();

            String computer = moves[random.nextInt(3)];

            String result = playRound(player, computer);

            if (result.equals("Player Wins"))
                wins++;
            else if (result.equals("Computer Wins"))
                losses++;
            else
                draws++;

            System.out.println(i + "\t" + player + "\t\t" +
                               computer + "\t\t" + result);
        }

        double winPercentage = (wins / 5.0) * 100;

        System.out.println("\nFinal Summary");
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.println("Win %: " + winPercentage + "%");

        sc.close();
    }
}
