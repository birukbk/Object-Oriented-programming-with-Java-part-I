public class Player {
    private String playerName;
    private int amountOfGoal;

    public Player(String playerName, int amountOfGoal){
        this.playerName = playerName;
        this.amountOfGoal = amountOfGoal;
    }
    public Player(String playerName){
       this(playerName,0);

    }
    public String getName(){
        return this.playerName;
    }
    public int goals(){
        return this.amountOfGoal;
    }
    public String toString(){
        return this.playerName + "," + "goals " + this.amountOfGoal;
    }
}
