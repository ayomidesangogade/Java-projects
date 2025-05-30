import java.util.Scanner;

public class LargestNumber {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you want to input? ");
        int num = input.nextInt();

        double [] numbers = new double[num];

        for (int i = 0; i < num; i ++){
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextDouble();
        }

        double largestNum = numbers[0];

        for (int j = 0; j < numbers.length; j ++){
            // System.out.print(" " + numbers[j] + " "); 
            if (numbers[j] > largestNum){
                largestNum = numbers[j];
            }  
        } 
        System.out.println("The largest number in the array is: " + largestNum);
        input.close();
    }
}