import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);


        System.out.println("Type exam scores, -1 completes: ");
        int score = Integer.parseInt(lukija.nextLine());

        while (score != -1){
            score = Integer.parseInt(lukija.nextLine());
        }


    }
}
