
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int upToNumber;
        int number=1;

        System.out.println("Up to what number: ");
        upToNumber = reader.nextInt();
        while (upToNumber>=number){
            System.out.println(number);
            number++;

        }

    }
}
