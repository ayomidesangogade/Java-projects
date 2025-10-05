package Exercises;

public class PalindromeBeginner {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int integer = input.nextInt();
        int lastDigit = integer%10;
        int firstDigit = integer/100;
        if(lastDigit == firstDigit)
            System.out.println(integer+" is a palindrome.");
        else
            System.out.println(integer+" is not a palindrome.");
        input.close();
    }
}

