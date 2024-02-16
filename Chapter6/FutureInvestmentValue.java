package Chapter6;

public class FutureInvestmentValue {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("The amount invested: ");
        double amount = input.nextDouble();

        System.out.print("Annual interest rate: ");
        double interestRate = input.nextDouble();

        double monthlyInterestRate = interestRate/1200.0;
        System.out.println("Years\t\tFuture Value");
        for(int i = 1; i<= 30; i++){
            System.out.printf("%d\t\t%.2f\n",i,futureInvestmentValue(amount, monthlyInterestRate, i));
        }
        input.close();
    }
    public static double futureInvestmentValue(double amount, double monthlyInterestRate, int years){
        double futureInvestmentValue = amount * Math.pow(1 + monthlyInterestRate, (years*12));
        return futureInvestmentValue;
    }
}
