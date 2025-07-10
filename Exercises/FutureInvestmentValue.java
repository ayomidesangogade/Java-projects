import java.util.Scanner;
public class FutureInvestmentValue {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter number of years: ");
        int numberOfYears = input.nextInt();
        double investmentValue = (investmentAmount * annualInterestRate * numberOfYears)/100;
        double futureInvestmentValue = investmentValue + investmentAmount;
        input.close();
        System.out.println("Accumulated value is $"+(float)futureInvestmentValue);
    }
}
