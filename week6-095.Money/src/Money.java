
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    public Money plus(Money added){
        Money sum = new Money(this.euros+added.euros,this.cents+ added.cents);
        return sum;
    }

    public boolean less(Money compared){
        if (compared.euros == this.euros){
            if (this.cents < compared.cents )
                return true;
        }
        if (this.euros < compared.euros) return true;
        return false;
    }

    public int euroToCents(int euro, int cents){
        return euro * 100 + cents;
    }

    public Money minus(Money decremented){
        int thisMoney = euroToCents(this.euros, this.cents);
        int thatMoney = euroToCents(decremented.euros, decremented.cents);
        int newMoney = thisMoney - thatMoney;

        if (newMoney < 0){
            return new Money(0,0);
        }
        return new Money(0, newMoney);
    }   


}
