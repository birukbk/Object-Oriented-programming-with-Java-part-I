
import java.util.ArrayList;

public class AverageOfNumbers {

    public static int sum(ArrayList<Integer> list) {
            int total = 0;
            for (int item : list) {
                total += item;
            }
            return total;
        }
    public static double average(ArrayList<Integer> list) {
        int sum  = sum(list);
        return (double) sum / list.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        System.out.println("The average is: " + average(list));
    }
}