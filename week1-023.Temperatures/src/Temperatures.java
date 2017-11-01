
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        while (true){
            System.out.println("Enter a number ");
            double number = Double.parseDouble(reader.nextLine());
            if (number >= 0 && number <= 39 )
            Graph.addNumber(number);
        }
    }
}