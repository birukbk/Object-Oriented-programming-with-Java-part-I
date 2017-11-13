
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    private double priceOfEconomicalLunch = 2.50;
    private double priceOfGourmetLunch = 4.0;

    public CashRegister() {
        this.cashInRegister = 1000;
        // at start the register has 1000 euros 
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven>= priceOfEconomicalLunch){
            this.cashInRegister+= priceOfEconomicalLunch;
            this.economicalSold++;
            return cashGiven - priceOfEconomicalLunch;
        }
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        if (cashGiven>= priceOfGourmetLunch){
            this.cashInRegister+= priceOfGourmetLunch;
            this.gourmetSold++;
            return cashGiven - priceOfGourmetLunch;
        }
        return cashGiven;
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}