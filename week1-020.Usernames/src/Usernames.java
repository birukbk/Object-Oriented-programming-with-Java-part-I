
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        String userName1="alex",userName2="emily";
        String password1= "mightyducks",password2 = "cat";

        Scanner reader = new Scanner(System.in);
        System.out.println("Type your username: ");
        String userName = reader.nextLine();
        System.out.println("Type your password: ");
        String password = reader.nextLine();

        if (userName.equals(userName1) && password.equals(password1)){
            System.out.println("You are now logged into the system!");
        }
        else if(userName.equals(userName2) && password.equals(password2)){
            System.out.println("You are now logged into the system!");
        }
        else
        {
            System.out.println("Your username or password was invalid!");
        }



    }
}
