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
    public void loadMoney(double amount) {
        if (this.balace + amount>=150){
            this.balace = 150;
        }
        else {
            this.balace +=amount;
        }

    }
}
