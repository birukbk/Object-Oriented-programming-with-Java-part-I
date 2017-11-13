public class Reformatory {
    private int numberOfWeightMeasured=0;

    public int weight(Person person) {
        this.numberOfWeightMeasured++;
        return person.getWeight();

    }

    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }

    public int totalWeightsMeasured(){
        return this.numberOfWeightMeasured;
    }

}
