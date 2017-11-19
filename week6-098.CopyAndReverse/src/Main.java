

public class Main {

    public static void main(String[] args) {
        // write testcode here
    }
    public static int[] copy(int[] array){
        int[] copyedArray = new int[array.length];
        for (int i = 0; i < copyedArray.length; i++){
            copyedArray[i] = array[i];
        }
        return copyedArray;
    }
    
}
