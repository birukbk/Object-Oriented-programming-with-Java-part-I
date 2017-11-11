
public class NumberStatistics {
    private int amountOfNumbers;
    private int addedNumberCounter=0;

    public NumberStatistics() {
        this.amountOfNumbers =0;
    }

    public void addNumber(int number) {
        this.addedNumberCounter++;
        this.amountOfNumbers += number;


    }

    public int amountOfNumbers() {
        return addedNumberCounter;
    }
}
