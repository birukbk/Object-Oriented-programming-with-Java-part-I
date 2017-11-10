public class LyyraCard {
    private double balace;

    public LyyraCard(double balanceAtstart){
        this.balace = balanceAtstart;
    }
    public String toString(){
        return "The card has " + this.balace + " euros";
    }
    public void payEconomical(){
        this.balace -= 2.50;

    }
    public void payGourmet(){
        this.balace -= 4.0;

    }
}
