
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        for (int element:array
             ) {
            printStar(element);
            System.out.println();
        }

    }

    public static void printStar(int amount){
        for (int i=0; i< amount; i++){
            System.out.print("*");
        }
    }
}
