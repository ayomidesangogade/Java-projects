package Chapter4;

public class VowelOrConsonant{
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = input.nextLine();
        vowelOrConsonantChecker(letter);
        input.close();
   }
   public static void vowelOrConsonantChecker(String letter){
        if(letter.length() != 1){
            System.out.println("Input must be exactly a character.");
            System.exit(1);
        }
        char ch = letter.charAt(0);
        if(Character.isLetter(ch)){
            if(Character.toUpperCase(ch) == 'A' || Character.toUpperCase(ch) == 'E' || Character.toUpperCase(ch) == 'I' || Character.toUpperCase(ch) == 'O' || Character.toUpperCase(ch) == 'U')
                System.out.println(ch+" is a vowel.");
            else if(Character.toUpperCase(ch) != 'A' || Character.toUpperCase(ch) != 'E' || Character.toUpperCase(ch) != 'I' || Character.toUpperCase(ch) != 'O' || Character.toUpperCase(ch) != 'U')
                System.out.println(ch+" is a consonant");
        }
        else
            System.out.println(ch+" is an invalid input.");
   }
}