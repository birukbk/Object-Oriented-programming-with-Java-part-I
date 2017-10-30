
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        double number1 = reader.nextInt();
        System.out.println("Type another number: ");
        double number2 = reader.nextInt();
        double division = number1/number2;
        System.out.println("Division: "+ number1+ " / " + number2 + " = " + division);
    }
}
