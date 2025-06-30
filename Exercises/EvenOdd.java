package Exercises;

import java.util.Scanner;
public class EvenOdd {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: "); 
        int number = input.nextInt(); // this takes the number into the system
        if (number%2 == 0) // this checks whether the number is divisible by two or not
            System.out.println(number+" is an even number."); // this executes, if true
        else
            System.out.println(number+" is an odd number.");// this executes, if false
        input.close();
    }
}
