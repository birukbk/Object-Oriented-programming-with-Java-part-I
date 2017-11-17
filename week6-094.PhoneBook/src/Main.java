
public class Main {

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Pekka Mikkola", "040-123123");
        phonebook.add("Edsger Dijkstra", "045-456123");
        phonebook.add("Donald Knuth", "050-222333");

        phonebook.printAll();
    }
}
