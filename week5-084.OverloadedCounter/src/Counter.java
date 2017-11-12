public class Counter {

    private int value;
    private boolean check;

    public Counter(){
        this(0,false);
    }
    public Counter(int startingValue, boolean check){
        this.value = startingValue;
        this.check = check;
    }
    public Counter(int startingValue){
        this(startingValue, false);
    }
    public Counter(boolean check){
        this(0, check);
    }

    public int value(){
        return this.value;
    }
    public void increase(){
        this.value++;
    }
    public void decrease(){
        if (check){
            if (value > 0) {
                this.value--;
            }
        }else{
            this.value--;
        }
    }

    public void increase(int increaseAmount){
        if (increaseAmount > 0)
            this.value += increaseAmount;
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            if (check) {
                if (decreaseAmount <= this.value) {
                    this.value -= decreaseAmount;
                } else {
                    this.value = 0;
                }
            }else{
                this.value -= decreaseAmount;
            }
        }
    }


    public String toString(){
        return "Value: " + value;
    }

}
