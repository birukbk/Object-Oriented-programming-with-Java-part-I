import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> listOfPlayers = new ArrayList<Player>();

    public Team(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void addPlayer(Player player){
        listOfPlayers.add(player);
    }
    public void printPlayers(){
        for (Player player:listOfPlayers
             ) {
            System.out.println(player);

        }
    }
}
