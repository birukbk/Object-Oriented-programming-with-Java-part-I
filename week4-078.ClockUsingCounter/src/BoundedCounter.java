public class BoundedCounter {
    private  int value=0;
    private int upperBound;

    public BoundedCounter(int upperBound){
        this.upperBound = upperBound;
    }

    public void next(){
        if (this.value==upperBound){
            this.value = 0;
        }
        else {
            this.value++;

        }

    }

    public String toString(){
        if (this.value<10){
            return  "The counter is : "+ "0"+this.value;

        }
        else {
            return  "The counter is : "+ this.value;

        }

    }
}
