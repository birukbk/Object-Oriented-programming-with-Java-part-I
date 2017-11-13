public class Reformatory {

    public int weight(Person person) {
        return person.getWeight();
    }

    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }

}
