
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the radius: ");
        double radius = reader.nextDouble();
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of the circle: "+ circumference);
    }
}
