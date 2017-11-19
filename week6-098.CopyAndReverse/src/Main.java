import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        
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
