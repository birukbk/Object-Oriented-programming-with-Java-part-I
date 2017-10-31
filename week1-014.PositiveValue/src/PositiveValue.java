
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = reader.nextInt();
        if (number > 0){
            System.out.println("The number is positive.");
        }
        if (number<=0){
            System.out.println("The number is not positive");
        }

    }
}
