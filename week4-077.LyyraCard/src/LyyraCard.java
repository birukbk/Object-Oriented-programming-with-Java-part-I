public class LyyraCard {
    private double balace;

    public LyyraCard(double balanceAtstart){
        this.balace = balanceAtstart;
    }
    public String toString(){
        return "The card has " + this.balace + " euros";
    }
    public void payEconomical(){
        if (this.balace>= 2.50){
            this.balace -= 2.50;
        }


    }
    public void payGourmet(){
        if (this.balace>=4.0){
            this.balace -= 4.0;
        }

    }
}
