
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        System.out.println("Length of the firs part: ");
        int lengthOfTheFirstPart= reader.nextInt();
        System.out.println("Result: "+ word.substring(0,lengthOfTheFirstPart));
    }
}
