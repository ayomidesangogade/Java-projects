import java.util.Scanner;
public class ComputeChange {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = input.nextDouble();
        input.close();

        int remainingAmount = (int)(amount*100);

        int numberOfOneDollars = remainingAmount/100;
        remainingAmount = remainingAmount%100;

        int numberOfOneQuarters = remainingAmount/25;
        remainingAmount = remainingAmount%25;

        int numberOfOneDimes = remainingAmount/10;
        remainingAmount = remainingAmount%10;

        int numberOfOneNickels = remainingAmount/5;
        remainingAmount = remainingAmount%5;

        int numberOfOnePennies = remainingAmount;
        System.out.println("Your amount "+amount+" consists of");
        if(numberOfOneDollars>1)
            System.out.println("    "+numberOfOneDollars+" dollars");
        else
            System.out.println("    "+numberOfOneDollars+" dollar");
        if(numberOfOneQuarters>1)
            System.out.println("    "+numberOfOneQuarters+" quarters");
        else
            System.out.println("    "+numberOfOneQuarters+" quarter");
        if(numberOfOneDimes>1)
            System.out.println("    "+numberOfOneDimes+" dimes");
        else
            System.out.println("    "+numberOfOneDimes+" dime");
        if(numberOfOneNickels>1)
            System.out.println("    "+numberOfOneNickels+" nickels");
        else
            System.out.println("    "+numberOfOneNickels+" nickel");
        if(numberOfOnePennies>1)
            System.out.println("    "+numberOfOnePennies+" pennies");
        else
            System.out.println("    "+numberOfOnePennies+" penny");
    }
}

