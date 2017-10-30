
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class NhlStatisticsPart2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("NHL statistics service");

        while (true) {
            System.out.println("");
            System.out.print("command (points, goals, assists, penalties, player, club, quit): ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("points")) {
                // Print the top ten players sorted by points.
            } else if (command.equals("goals")) {
                // Print the top ten players sorted by goals.
            } else if (command.equals("assists")) {
                //  Print the top ten players sorted by assists.
            } else if (command.equals("penalties")) {
                //  Print the top ten players sorted by penalties.
            } else if (command.equals("player")) {
                // Ask the user first which player's statistics are needed and then print them.
            } else if (command.equals("club")) {
                // Ask the user first which club's statistics are needed and then print them.
                // Note: When printing statistics they should be ordered by points (so the players with the most points come first).
            }

        }
    }
}
