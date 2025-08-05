package Exercises;

public class CompoundInterest {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = input.nextDouble();
        System.out.print("Enter Rate: ");
        double rate = input.nextDouble();
        System.out.print("Enter number of years: ");
        int time = input.nextInt();
        input.close();
        double interest = (principal*rate)/100;
        double compoundInterestCallOut = 0;
        double amount = principal+interest;
        int i;
        for(i = 0;i<(time-1);i++){
            double compoundInterest = (amount*rate)/100;
            amount += compoundInterest;
            compoundInterestCallOut = compoundInterest; compoundInterest = compoundInterestCallOut;
        }
        System.out.println((int)(compoundInterestCallOut*1000)/1000.0);
    }
}

