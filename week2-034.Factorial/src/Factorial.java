import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int factorial=1;
        int counter=1;
        int until;
        System.out.println("Type a number :");
        until = reader.nextInt();
        while (counter <= until){
                factorial *=counter;
                counter++;
        }
        System.out.println("Factorial is :"+ factorial);


    }
}
