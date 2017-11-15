import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> listOfPlayers = new ArrayList<Player>();
    private int maxTeamSize;

    public Team(String name){
        this.name = name;
        this.maxTeamSize =16;
    }
    public String getName(){
        return this.name;
    }
    public void addPlayer(Player player){
        if (listOfPlayers.size()< maxTeamSize )  listOfPlayers.add(player);
    }
    public void printPlayers(){
        for (Player player:listOfPlayers
             ) {
            System.out.println(player);

        }
    }
    public void setMaxSize(int maxsize){
        this.maxTeamSize = maxsize;
    }

    public int size(){
        return listOfPlayers.size();
    }

    public int goals(){
        int totalNumberOfGoalsForAllPlayers=0;
        for (Player player:listOfPlayers
             ) {
            totalNumberOfGoalsForAllPlayers += player.goals();
        }
        return totalNumberOfGoalsForAllPlayers;
    }

}
