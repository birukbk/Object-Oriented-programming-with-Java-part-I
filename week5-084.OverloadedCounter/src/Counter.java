public class Counter {
    private int numberCounter;
    private boolean cheack= true;

    public Counter(int startingValue, boolean check){
        if (startingValue<0) check= false;
        this.numberCounter = startingValue;

    }
    public Counter(int startingValue){
        this.numberCounter = startingValue;

    }
    public Counter(boolean check){
        if (check==true) this.numberCounter=0;
    }
    public Counter(){
        this.numberCounter=0;
    }

    public int value(){
        return this.numberCounter;
    }
    public void increase(){
        this.numberCounter++;
    }
    public void decrease(){
        if (this.numberCounter>0 && cheack==true)  this.numberCounter--;

    }

}
