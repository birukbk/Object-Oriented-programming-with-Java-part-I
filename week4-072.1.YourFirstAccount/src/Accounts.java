
public class Accounts {

    public static void main(String[] args) {
        Account account = new Account("Barry",100);
        account.deposit(20);
        System.out.println(account.toString());
    }

}
