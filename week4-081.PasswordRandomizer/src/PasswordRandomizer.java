import java.util.Random;

public class PasswordRandomizer {
    private int length;

    public PasswordRandomizer(int length) {
        this.length = length;

    }

    public String createPassword() {
        Random random  = new Random();
        String password = "";
        int index;
        for (int i = 0; i < this.length; i++){
            index = random.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(index);
            password += symbol;
        }
        return password;
    }
}
