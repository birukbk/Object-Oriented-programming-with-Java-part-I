public class LyyraCard {
    private double balace;

    public LyyraCard(double balanceAtstart){
        this.balace = balanceAtstart;
    }
    public String toString(){
        return "The card has " + this.balace + " euros";
    }
}
