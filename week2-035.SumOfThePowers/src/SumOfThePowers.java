
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum=0;
        double number;
        int counter =0;
        System.out.println("Type a number :");
        number = reader.nextDouble();
        while (counter<= number){
            sum += (int)Math.pow(2,counter);
            counter++;

        }
        System.out.println("The result is "+ (sum));

    }

}
