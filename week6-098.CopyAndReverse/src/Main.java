import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);

        // change the copied
        copied[0] = 99;

        // print both
        System.out.println( "original: " + Arrays.toString(original));
        System.out.println( "copied: " + Arrays.toString(copied));
    }
    public static int[] copy(int[] array){
        int[] copyedArray = new int[array.length];
        for (int i = 0; i < copyedArray.length; i++){
            copyedArray[i] = array[i];
        }
        return copyedArray;
    }
    
}
