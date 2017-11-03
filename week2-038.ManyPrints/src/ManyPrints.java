
import java.util.Scanner;

public class ManyPrints {
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

    public static void main(String[] args) {

        int howMany=0;
        Scanner reader = new Scanner(System.in);
        System.out.println("How many?");
        howMany = Integer.parseInt(reader.nextLine());
        while(0<howMany){
            printText();
            howMany--;

        }

    }
}