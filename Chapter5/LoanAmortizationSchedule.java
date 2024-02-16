package Chapter5;

public class LoanAmortizationSchedule {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();

        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate/1200;
        double monthlyPayment = loanAmount * monthlyInterestRate/(1 - 1/Math.pow((1+monthlyInterestRate),(numberOfYears*12)));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.println();
        System.out.printf("Monthly Payment: %.2f\n",monthlyPayment);
        System.out.printf("Total Payment: %.2f\n",totalPayment);
        System.out.println();
        
        double balance = totalPayment;
        System.out.println("Payment#\tInterest\tPrincipal\tBalance");
        for(int i = 1; i<=numberOfYears*12;i++){
            double interest = monthlyInterestRate * balance;
            double principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n",i,interest,principal,balance);
        }
        input.close();
    }
}