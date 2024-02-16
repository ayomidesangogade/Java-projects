package Chapter5;

public class ComputeCDValue {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the initial deposit amount: ");
        double initialDeposit = input.nextDouble();

        System.out.print("Enter annual percentage yield: ");
        double annualPercentage = input.nextDouble();

        System.out.print("Enter maturity period (number of months): ");
        double maturityPeriod = input.nextDouble();

        double cdValue = 0;
        int i = 1;
        double firstCDValue = initialDeposit + initialDeposit * annualPercentage / 1200;
        System.out.println();
        System.out.printf("%s\t\t%s\n","Month","CD Value");
        while(i<= maturityPeriod){
            cdValue = firstCDValue + firstCDValue * annualPercentage / 1200;
            double temp = firstCDValue; firstCDValue = cdValue; cdValue = temp;
            System.out.printf("%d\t\t%.2f\n",i,cdValue);
            i++;
        }
        
        input.close();
    }
}
