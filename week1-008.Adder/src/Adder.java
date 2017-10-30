
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        System.out.println("Type a number: ");
        int number1 = reader.nextInt();
        System.out.println("Type another number: ");
        int number2 = reader.nextInt();
        System.out.println("Sum of the numbers: "+ (number1+number2));
    }
}
