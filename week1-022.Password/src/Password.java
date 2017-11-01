
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.


        while(true){
            System.out.println("Type the password: ");
            String input = reader.nextLine();
            if (input.equals(password)){
                System.out.println("Right!");
                System.out.println("The secret is jerry qbar");
                break;
            }else
            {
                System.out.println("Wrong!");
            }
        }


    }
}
