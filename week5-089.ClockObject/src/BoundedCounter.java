
public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78
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
            return  ""+ "0"+this.value;
        }
        else {
            return  ""+ this.value;
        }

    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int value) {
        if (value >= 0 && value <= upperBound)
            this.value = value;
    }

}
