
import nhlstats.NHLStatistics;

import java.util.Scanner;

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
                NHLStatistics.sortByPoints();
                NHLStatistics.top(10);
                // Print the top ten players sorted by points.
            } else if (command.equals("goals")) {
                NHLStatistics.sortByGoals();
                NHLStatistics.top(10);

                // Print the top ten players sorted by goals.
            } else if (command.equals("assists")) {
                NHLStatistics.sortByAssists();
                NHLStatistics.top(10);
                //  Print the top ten players sorted by assists.
            } else if (command.equals("penalties")) {
                NHLStatistics.sortByPenalties();
                NHLStatistics.top(10);
                //  Print the top ten players sorted by penalties.
            } else if (command.equals("player")) {
                System.out.println("which player's statistics do you want to print: ");
                String player = reader.nextLine();
                NHLStatistics.searchByPlayer(player);

                // Ask the user first which player's statistics are needed and then print them.
            } else if (command.equals("club")) {
                System.out.println("Which club statistics do you want to print: ");
                String club = reader.nextLine();
                NHLStatistics.sortByPoints();
                NHLStatistics.teamStatistics(club);
                // Ask the user first which club's statistics are needed and then print them.
                // Note: When printing statistics they should be ordered by points (so the players with the most points come first).
            }

        }
    }
}
