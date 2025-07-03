package Exercises;
import java.util.Scanner;

public class FabonacciSeries{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of series you want: ");
        int num = input.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.print(""+firstNumber+" "+secondNumber+"");
        input.close();
        int i;
        for(i = 0; i<=num-3;i++){
            int next = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = next;
            System.out.print(" "+(next));
        }
    } 
}
