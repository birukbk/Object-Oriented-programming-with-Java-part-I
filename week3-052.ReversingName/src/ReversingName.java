import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name :");
        String name = reader.nextLine();
        String reversedName = "";
        int i= name.length()-1;
        while (i>=0){
            reversedName += name.charAt(i);
            i--;
        } System.out.print("In reverse order:"+reversedName );

    }
}
