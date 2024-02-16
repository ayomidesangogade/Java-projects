package Chapter5;

public class MonthlyAndTotalPayment {
    public static void main(String[]args){
        double loanAmount = 10000;
        int numberOfYears = 5;
        System.out.printf("%s %18s %14s\n","Interest Rate", "Monthly Payment", "Total Payment");
        for(double i = 5.0; i<=8.0;i+=0.125){
            double monthlyInterestRate = i/1200.0;
            double monthlyPayment = loanAmount * monthlyInterestRate/(1 - 1/Math.pow((1+monthlyInterestRate),(numberOfYears*12)));
            double totalPayment = monthlyPayment * numberOfYears * 12;
            System.out.printf("%.3f%% %16.2f %18.2f\n",i,monthlyPayment,totalPayment);
        }
    }
}
