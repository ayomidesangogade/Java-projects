package Exercises;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        // this takes in the number of values
        System.out.print("Enter number of values: ");
        int num = input.nextInt();

        double [] numbers = new double[num];
        //this stores the numbers in the array.
        for (int i = 0; i < num; i++){
            System.out.print("Enter number "+(i+1)+": ");
            numbers[i] = input.nextDouble();
        }

        double largestNum = numbers[0];
        // if any number in the array is greater than the variable(largestNum), it becomes the largest number.
        for (int j = 0; j < numbers.length; j++){
            if (numbers[j] > largestNum){
                largestNum = numbers[j];
            }  
        } 
        System.out.println("The largest number is: "+largestNum);
        input.close();
    }
}
