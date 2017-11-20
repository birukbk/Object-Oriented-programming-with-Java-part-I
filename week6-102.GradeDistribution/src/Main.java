import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Grade gradeDistribution = new Grade();

        System.out.println("Type exam scores, -1 completes: ");
        int score = Integer.parseInt(lukija.nextLine());

        while (score != -1){
            gradeDistribution.add(score);
            score = Integer.parseInt(lukija.nextLine());
        }

        gradeDistribution.print();

    }
}
