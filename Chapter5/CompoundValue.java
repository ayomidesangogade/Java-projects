package Chapter5;

public class CompoundValue {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter your savings amount: ");
        double savingsAmount = input.nextDouble();

        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of months: ");
        int numberOfMonths = input.nextInt();

        double monthlyInterestRate = annualInterestRate/1200;
        double principal = savingsAmount * (1 + monthlyInterestRate);
        double compoundValue = 0;
        for(int i = 0;i<numberOfMonths;i++){
            compoundValue = (savingsAmount + principal) * (1 + monthlyInterestRate);
            double temp = principal; principal = compoundValue; compoundValue = temp;
        }
        System.out.printf("The amount in savings after %d months is %.3f",numberOfMonths,compoundValue);
        input.close();
    }
}
