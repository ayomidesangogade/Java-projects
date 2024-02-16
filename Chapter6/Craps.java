package Chapter6;

public class Craps {
    public static void main(String[]args){
        checkWin();
    }
    
    public static void checkWin(){

            int roll1 = 1+(int)(Math.random()*6);
            int roll2 = 1+(int)(Math.random()*6);
            int roll = roll1 + roll2;

        while(roll != 2 && roll != 3 && roll != 12){

            roll1 = 1+(int)(Math.random()*6);
            roll2 = 1+(int)(Math.random()*6);

            roll = roll1 + roll2;

            System.out.println("You rolled "+roll1+" + "+roll2+" = "+roll);
            if(roll == 2 || roll == 3 || roll == 12)
                System.out.println("You lose");
            else if(roll == 7 || roll == 11)
                System.out.println("You win");
            else
                System.out.println("point is "+roll);
        }
    }
}
