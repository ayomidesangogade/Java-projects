package Chapter3;

public class PickACard{
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a number to pick a random card (1 for hearts, 2 for diamonds, 3 for clubs, 4 for spades): ");
        int cardNumber = input.nextInt();
        int randomSuits = (int)(Math.random()*13);
        if (cardNumber == 1){
            switch(randomSuits){
                case 0:
                    System.out.println("The card you picked is Ace of Hearts.");
                    break;
                case 1:
                    System.out.println("The card you picked is 2 of Hearts.");
                    break;
                case 2:
                    System.out.println("The card you picked is 3 of Hearts.");
                    break;
                case 3:
                    System.out.println("The card you picked is 4 of Hearts.");
                    break;
                case 4:
                    System.out.println("The card you picked is 5 of Hearts.");
                    break;
                case 5:
                    System.out.println("The card you picked is 6 of Hearts.");
                    break;
                case 6:
                    System.out.println("The card you picked is 7 of Hearts.");
                    break;
                case 7:
                    System.out.println("The card you picked is 8 of Hearts.");
                    break;
                case 8:
                    System.out.println("The card you picked is 9 of Hearts.");
                    break;
                case 9:
                    System.out.println("The card you picked is 10 of Hearts.");
                    break;
                case 10:
                    System.out.println("The card you picked is Jack of Hearts.");
                    break;
                case 11:
                    System.out.println("The card you picked is Queen of Hearts.");
                    break;
                case 12:
                    System.out.println("The card you picked is King of Hearts.");
                    break;
            }
        }
        else if (cardNumber == 2){
            switch(randomSuits){
                case 0:
                    System.out.println("The card you picked is Ace of Diamonds.");
                    break;
                case 1:
                    System.out.println("The card you picked is 2 of Diamonds.");
                    break;
                case 2:
                    System.out.println("The card you picked is 3 of Diamonds.");
                    break;
                case 3:
                    System.out.println("The card you picked is 4 of Diamonds.");
                    break;
                case 4:
                    System.out.println("The card you picked is 5 of Diamonds.");
                    break;
                case 5:
                    System.out.println("The card you picked is 6 of Diamonds.");
                    break;
                case 6:
                    System.out.println("The card you picked is 7 of Diamonds.");
                    break;
                case 7:
                    System.out.println("The card you picked is 8 of Diamonds.");
                    break;
                case 8:
                    System.out.println("The card you picked is 9 of Diamonds.");
                    break;
                case 9:
                    System.out.println("The card you picked is 10 of Diamonds.");
                    break;
                case 10:
                    System.out.println("The card you picked is Jack of Diamonds.");
                    break;
                case 11:
                    System.out.println("The card you picked is Queen of Diamonds.");
                    break;
                case 12:
                    System.out.println("The card you picked is King of Diamonds.");
                    break;
            }
        }
        else if (cardNumber == 3){
            switch(randomSuits){
                case 0:
                    System.out.println("The card you picked is Ace of Clubs.");
                    break;
                case 1:
                    System.out.println("The card you picked is 2 of Clubs.");
                    break;
                case 2:
                    System.out.println("The card you picked is 3 of Clubs.");
                    break;
                case 3:
                    System.out.println("The card you picked is 4 of Clubs.");
                    break;
                case 4:
                    System.out.println("The card you picked is 5 of Clubs.");
                    break;
                case 5:
                    System.out.println("The card you picked is 6 of Clubs.");
                    break;
                case 6:
                    System.out.println("The card you picked is 7 of Clubs.");
                    break;
                case 7:
                    System.out.println("The card you picked is 8 of Clubs.");
                    break;
                case 8:
                    System.out.println("The card you picked is 9 of Clubs.");
                    break;
                case 9:
                    System.out.println("The card you picked is 10 of Clubs.");
                    break;
                case 10:
                    System.out.println("The card you picked is Jack of Clubs.");
                    break;
                case 11:
                    System.out.println("The card you picked is Queen of Clubs.");
                    break;
                case 12:
                    System.out.println("The card you picked is King of Clubs.");
                    break;
            }
        }
        else if (cardNumber == 4){
            switch(randomSuits){
                case 0:
                    System.out.println("The card you picked is Ace of Spades.");
                    break;
                case 1:
                    System.out.println("The card you picked is 2 of Spades.");
                    break;
                case 2:
                    System.out.println("The card you picked is 3 of Spades.");
                    break;
                case 3:
                    System.out.println("The card you picked is 4 of Spades.");
                    break;
                case 4:
                    System.out.println("The card you picked is 5 of Spades.");
                    break;
                case 5:
                    System.out.println("The card you picked is 6 of Spades.");
                    break;
                case 6:
                    System.out.println("The card you picked is 7 of Spades.");
                    break;
                case 7:
                    System.out.println("The card you picked is 8 of Spades.");
                    break;
                case 8:
                    System.out.println("The card you picked is 9 of Spades.");
                    break;
                case 9:
                    System.out.println("The card you picked is 10 of Spades.");
                    break;
                case 10:
                    System.out.println("The card you picked is Jack of Spades.");
                    break;
                case 11:
                    System.out.println("The card you picked is Queen of Spades.");
                    break;
                case 12:
                    System.out.println("The card you picked is King of Spades.");
                    break;
            }
        }
        input.close();
    }
}

