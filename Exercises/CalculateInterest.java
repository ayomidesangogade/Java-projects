package Exercises;

import java.util.Scanner;
public class CalculateInterest {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble();
        double interest = balance*(annualInterestRate/1200);
        input.close();
        System.out.println("The interest is "+(float)interest);
    }
}
