
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
     int largest = Math.max(number1,number2);
     if (largest>number3){
         return largest;
     }else
         return number3;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}