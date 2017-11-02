
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = 0;
        int untilWhat;
        int sum=0;
        System.out.println("Until what :");
        untilWhat = reader.nextInt();
        while (number<=untilWhat){
            sum+=number;
            number++;
            System.out.println(sum);

        }


    }
}
