// Sangogade Ayomide Ephraim
// 223322
// Level 200

public class DiceSimmulation {
    public static double dice() {
        double number = ((int) (Math.random() * 100))/100.0;
        return number;
    }
    public static int checkValue() {
        double diceValue = dice();
        if (diceValue >= 0 && diceValue <= (1.0/6)) {
            return 1;
        }
        else if (diceValue > (1.0/6) && diceValue <= (1.0/3)) {
            return 2;
        }
        else if (diceValue > (1.0/3) && diceValue <= (1.0/2)) {
            return 3;
        }
        else if (diceValue > (1.0/2) && diceValue <= (2.0/3)) {
            return 4;
        }
        else if (diceValue > (2.0/3) && diceValue <= (5.0/6)) {
            return 5;
        }
        else {
            return 6;
        }
    }
    
    public static void main (String[] args) {
        System.out.println("Your dice has rolled "+checkValue());   
    }
}
