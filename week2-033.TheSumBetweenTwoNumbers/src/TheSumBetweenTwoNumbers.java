
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum =0;
        int lowerBound;
        int upperBound;
        System.out.println("First: ");
        lowerBound = reader.nextInt();
        System.out.println("Last: ");
        upperBound = reader.nextInt();
        while (lowerBound <= upperBound){
            sum += lowerBound;
            lowerBound++;

        }
        System.out.println("The sum is : " + sum);
        
    }
}
