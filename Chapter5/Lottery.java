package Chapter5;

public class Lottery {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int lottery = 10 + (int)(Math.random()*90);
        System.out.print("Enter your lottery pick (two digits): ");
        int guess = input.nextInt();

        int lotteryDigit1 = lottery/10;
        int lotteryDigit2 = lottery%10;

        int random = 0;
        if(lotteryDigit1 == lotteryDigit2){
            while(lotteryDigit1 == lotteryDigit2){
                random = 10 + (int)(Math.random()*90);
                lotteryDigit1 = random/10;
                lotteryDigit2 = random%10;
            }
        int temp = random; random = lottery; lottery = temp;
        }
        int guessDigit1 = guess/10;
        int guessDigit2 = guess%10;

        System.out.println("The lottery number is " + lottery);

        if (lottery == guess)
            System.out.println("Exact match: you win $10,000");
        else if (lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1)
            System.out.println("Match all digits: you win $3,000");
        else if (lotteryDigit1 == guessDigit1||lotteryDigit1 == guessDigit2||lotteryDigit2 == guessDigit1||lotteryDigit2 == guessDigit2)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match");
        input.close();
    }
}

