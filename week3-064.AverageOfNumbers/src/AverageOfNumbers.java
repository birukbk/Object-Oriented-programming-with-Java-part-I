
import java.util.ArrayList;

public class AverageOfNumbers {

    public static int sum(ArrayList<Integer> list) {
        Integer sum = 0;
        for (Integer number: list
                ) {
            sum+=number;
        }
        return sum;
    }
    

    public static double average(ArrayList<Integer> list) {
        double average = sum(list)/((double)list.size());
        return average;
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