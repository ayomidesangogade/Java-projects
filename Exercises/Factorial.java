// SANGOGADE AYOMIDE
// 223322
// Level 200

import java.util.Scanner;
public class Factorial{
    public static int factorial(int n){
        if (n == 0||n == 1)
            return 1;
        else
            return n*factorial(n-1);
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int factorial = factorial(number);
        System.out.println("The factorial of "+number+" is "+factorial);
        input.close();
    }
}