
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        int i =text.length()-1;
        String reversed = "";
        while (i>=0){
            reversed+=text.charAt(i);
            i--;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
