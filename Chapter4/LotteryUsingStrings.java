package Chapter4;

public class LotteryUsingStrings {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        String lotteryString = input.nextLine();

        lotteryChecker(lotteryString);
        input.close();
    }
    public static void lotteryChecker(String lotteryString){
        if (lotteryString.length() > 2){
            System.out.println("You are to enter two digits.");
            System.exit(1);
        }
        String guess = "" + (10 + (int)(Math.random()*90));
        System.out.println("The lottery number is "+guess);

        char lotteryDigit1 = lotteryString.charAt(0);
        char lotteryDigit2 = lotteryString.charAt(1);

        if(lotteryDigit1 == guess.charAt(0) && lotteryDigit2 == guess.charAt(1))
            System.out.println("Exact match: you win $10,000");
        else if (lotteryDigit1 == guess.charAt(1) && lotteryDigit2 == guess.charAt(0))
            System.out.println("Match all digits: you win $3,000");
        else if(lotteryDigit1 == guess.charAt(0) || lotteryDigit1 == guess.charAt(1) || lotteryDigit2 == guess.charAt(0) || lotteryDigit2 == guess.charAt(1))
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match");
    }
}
