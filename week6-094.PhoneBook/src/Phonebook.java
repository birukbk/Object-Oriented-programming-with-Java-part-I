import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> phoneBook;

    public Phonebook() {
        this.phoneBook = new ArrayList<Person>();
    }

    public void printAll(){
        for (Person person:phoneBook
             ) {
            System.out.println(person);

        }
    }
    public void add(String name, String number){
        phoneBook.add(new Person(name,number));
    }

    public String searchNumber(String name){
        for (Person person:phoneBook
             ) {
            if (person.getName().contains(name)){
                return person.getNumber();
            }
        }
        return "number not known";
    }
}
