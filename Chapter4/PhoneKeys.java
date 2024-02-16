package Chapter4;

public class PhoneKeys {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = input.nextLine();
        phoneKeysCorrespondent(letter);
        input.close();
    }
    public static void phoneKeysCorrespondent(String letter){
        if(letter.length() != 1){
            System.out.println("Input must be exactly a character.");
            System.exit(1);
        }
        char ch = letter.charAt(0);
        if(Character.isLetter(ch)){
            if(Character.toLowerCase(ch) == 'a' || Character.toLowerCase(ch) == 'b' || Character.toLowerCase(ch) == 'c')
                System.out.println("The corresponding number is 2.");
            else if(Character.toLowerCase(ch) == 'd' || Character.toLowerCase(ch) == 'e' || Character.toLowerCase(ch) == 'f')
                System.out.println("The corresponding number is 3.");
            else if(Character.toLowerCase(ch) == 'g' || Character.toLowerCase(ch) == 'h' || Character.toLowerCase(ch) == 'i')
                System.out.println("The corresponding number is 4.");
            else if(Character.toLowerCase(ch) == 'j' || Character.toLowerCase(ch) == 'k' || Character.toLowerCase(ch) == 'l')
                System.out.println("The corresponding number is 5.");
            else if(Character.toLowerCase(ch) == 'm' || Character.toLowerCase(ch) == 'n' || Character.toLowerCase(ch) == 'o')
                System.out.println("The corresponding number is 6.");
            else if(Character.toLowerCase(ch) == 'p' || Character.toLowerCase(ch) == 'q' || Character.toLowerCase(ch) == 'r' || Character.toLowerCase(ch) == 's')
                System.out.println("The corresponding number is 7.");
            else if(Character.toLowerCase(ch) == 't' || Character.toLowerCase(ch) == 'u' || Character.toLowerCase(ch) == 'v')
                System.out.println("The corresponding number is 8.");
            else if(Character.toLowerCase(ch) == 'w' || Character.toLowerCase(ch) == 'x' || Character.toLowerCase(ch) == 'y' || Character.toLowerCase(ch) == 'z')
                System.out.println("The corresponding number is 9.");
        }
        else
            System.out.println(ch+" is an invalid input.");
    }
}
