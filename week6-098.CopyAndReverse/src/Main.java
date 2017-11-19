import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));
    }
    public static int[] copy(int[] array){
        int[] copyedArray = new int[array.length];
        for (int i = 0; i < copyedArray.length; i++){
            copyedArray[i] = array[i];
        }
        return copyedArray;
    }

    public static int[] reverseCopy(int[] array){
        int[] reversedArray = new int[array.length];
        for (int i = array.length-1; i >= 0; i--){
            reversedArray[array.length-1-i] = array[i];
        }
        return reversedArray;

    }
    
}
