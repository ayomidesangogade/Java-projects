package Chapter3;

public class CurrencyExchange {
    public static double currencyExchange(double rate, int choice, double amount){
        if(choice == 0)
            return rate*amount;
        else 
            return amount/rate;
    }

    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double rate = input.nextDouble();

        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int choice = input.nextInt();

        if(choice == 0){
            System.out.print("Enter the dollar amount: ");
            double amount = input.nextDouble();
            System.out.println("$"+amount+" is "+currencyExchange(rate, choice, amount)+" yuan");
        }
        else if(choice == 1){
            System.out.print("Enter the RMB amount: ");
            double amount = input.nextDouble();
            System.out.println(amount+" yuan is $"+currencyExchange(rate, choice, amount));
        }
        else
            System.out.println("Invalid Input");
        input.close();
    }
}
