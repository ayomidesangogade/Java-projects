package Chapter5;

public class GuessNumber {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int magicNumber = (int)(Math.random()*101);
        System.out.println("Guess a magic number between 0 and 100");
        System.out.print("Enter your guess: ");
        int guess = input.nextInt();

        while(magicNumber != guess){
            if(guess > magicNumber){
                System.out.println("Your guess is too high");
                System.out.print("Enter your guess: ");
                guess = input.nextInt();
            }
            else if(guess < magicNumber){
                System.out.println("Your guess is too low");
                System.out.print("Enter your guess: ");
                guess = input.nextInt();
            }
        }
        System.out.println("Yes, the number is "+guess);
        input.close();
    }
}
