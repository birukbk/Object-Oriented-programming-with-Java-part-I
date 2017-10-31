
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String person1Name = reader.nextLine();

        System.out.println("Type your age: ");
        int person1Age = Integer.parseInt(reader.nextLine());

        System.out.println("Type your name: ");
        String person2Name = reader.nextLine();

        System.out.println("Type your age: ");
        int person2Age = Integer.parseInt(reader.nextLine());



        System.out.println(person1Name + " and " + person2Name + " are " + (person1Age+person2Age) + " years old in total.");
    }
}
