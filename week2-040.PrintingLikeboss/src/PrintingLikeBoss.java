public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int printed = 0;
        while (printed < amount) {
            System.out.print("*");
            printed = printed + 1;
        }
        System.out.println("");
    }



    public static void printWhitespaces(int amount) {
        int i =0;
        while (i<amount){
            System.out.print(" ");
            i++;
        }
        // 40.1
    }

    public static void printTriangle(int size) {
        int i = 1;
        while (i <= size) {
            printWhitespaces(size - i);
            printStars(i);
            i++;
        }
        // 40.2
    }

    public static void xmasTree(int height) {
        // 40.3
        int i = 1;
        while (i <= height) {
            printWhitespaces(height - i);
            printStars(i + (i - 1));
            i++;
        }

        printWhitespaces(height - 2);
        printStars(3);
        printWhitespaces(height - 2);
        printStars(3);
    }


    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        printStars(3);
        System.out.println("");
        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
