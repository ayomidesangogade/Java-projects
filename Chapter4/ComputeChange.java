package Chapter4;

public class ComputeChange {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter amount: ");
        String amount = input.nextLine();
        calculateChange(amount);
        input.close();
    }
    public static void calculateChange(String amount){
        int index = 0;
        if(amount.contains(".")){
            index += amount.indexOf(".");
        }
        String firstPart = amount.substring(0,index);
        String secondPart = amount.substring(index+1);
        int remainingAmount = Integer.parseInt(secondPart);

        int numberOfOneDollars = Integer.parseInt(firstPart);

        int numberOfOneQuarters = remainingAmount/25;
        remainingAmount = remainingAmount%25;

        int numberOfOneDimes = remainingAmount/10;
        remainingAmount = remainingAmount%10;

        int numberOfOneNickels = remainingAmount/5;
        remainingAmount = remainingAmount%5;

        int numberOfOnePennies = remainingAmount;
        System.out.println("Your amount "+amount+" consists of");
        if(numberOfOneDollars>1)
            System.out.printf("%-3s %d dollars\n","",numberOfOneDollars);
        else
            System.out.printf("%-3s %d dollar\n","",numberOfOneDollars);
        if(numberOfOneQuarters>1)
            System.out.printf("%-3s %d quarters\n","",numberOfOneQuarters);
        else
            System.out.printf("%-3s %d quarter\n","",numberOfOneQuarters);
        if(numberOfOneDimes>1)
            System.out.printf("%-3s %d dimes\n","",numberOfOneDimes);
        else
            System.out.printf("%-3s %d dime\n","",numberOfOneDimes);
        if(numberOfOneNickels>1)
            System.out.printf("%-3s %d nickels\n","",numberOfOneNickels);
        else
            System.out.printf("%-3s %d nickel\n","",numberOfOneNickels);
        if(numberOfOnePennies>1)
            System.out.printf("%-3s %d pennies\n","",numberOfOnePennies);
        else
            System.out.printf("%-3s %d penny\n","",numberOfOnePennies);
    }
}


