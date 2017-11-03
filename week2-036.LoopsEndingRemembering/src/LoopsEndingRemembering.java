import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        int number;
        double sum = 0;
        int count=0;
        double average;
        int evenNumber=0;
        int oddNumber=0;
        Scanner reader = new Scanner(System.in);

        while(true){
            System.out.println("Type numbers");
            number = Integer.parseInt(reader.nextLine());
            if (number%2==0){
                evenNumber++;
            }else if (number%2!=0 && number!=-1){
                oddNumber++;
            }
            if (number==-1){
                System.out.println("Thank you and see you later");

                break;
            }
            else{
                sum += number;
                count++;
            }
        }

        System.out.println("The sum is : "+ (int)sum);
        System.out.println("How many numbers: " + count);
        average = sum/count;
        System.out.println("Average :"+ average);
        System.out.println("Even number : " + evenNumber);
        System.out.println("Odd number: " + oddNumber);


    }
}
