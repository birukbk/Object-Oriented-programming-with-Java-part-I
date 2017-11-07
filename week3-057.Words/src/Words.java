import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String userTypedWord = "";

        do {
            System.out.println("Type a word :");
            userTypedWord = reader.nextLine();
            words.add(userTypedWord);
        }while(!userTypedWord.isEmpty());


        System.out.println("You typed the following words: ");
        for (String word : words) {
            System.out.println(word);
        }

    }
}
