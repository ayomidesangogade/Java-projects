package Chapter5;

public class PaperScissorsRock {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        int playerWin = 0;
        int computerWin = 0;
        while(playerWin <= 4 && computerWin <= 4){
            System.out.print("scissor (0), rock (1), paper (2): ");
            int playerChoice = input.nextInt();
            int computerChoice = (int)(Math.random()*3);

            String element = "";
            String playerElement = "";
            if (computerChoice == 0)
                element = "scissor";
            else if (computerChoice == 1)
                element = "rock";
            else
                element = "paper";

            if (playerChoice == 0)
                playerElement = "scissor";
            else if (playerChoice == 1)
                playerElement = "rock";
            else
                playerElement = "paper";
            
            if(playerChoice == computerChoice){
                System.out.println("You picked "+playerElement+", computer picked "+element);
                System.out.println("It's a tie");
            }
            else if(playerChoice == 1 && computerChoice == 0){
                System.out.println("You picked "+playerElement+", computer picked "+element);
                System.out.println("Rock smashes Scissors, you win!");
                playerWin++;
            }
            else if(playerChoice == 0 && computerChoice == 1){
                System.out.println("You picked "+playerElement+", computer picked "+element);
                System.out.println("Rock smashes Scissors, you lose!");
                computerWin++;
            }
            else if(playerChoice == 1 && computerChoice == 2){
                System.out.println("You picked "+playerElement+", computer picked "+element);
                System.out.println("Paper covers Rock, you lose!");
                computerWin++;
            }
            else if(playerChoice == 2 && computerChoice == 1){
                System.out.println("You picked "+playerElement+", computer picked "+element);
                System.out.println("Paper covers Rock, you win!");
                playerWin++;
            }
            else if(playerChoice == 2 && computerChoice == 0){
                System.out.println("You picked "+playerElement+", computer picked "+element);
                System.out.println("Scissors cut Paper, you lose!");
                computerWin++;
            }
            else if(playerChoice == 0 && computerChoice == 2){
                System.out.println("You picked "+playerElement+", computer picked "+element);
                System.out.println("Scissors cut Paper, you win!");
                playerWin++;
            }
    }
        
    input.close();
    }
}
