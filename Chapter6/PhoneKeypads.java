package Chapter6;

public class PhoneKeypads {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine().toUpperCase();

        String number = "";
        String letterString = "";
        for(int i = 0; i<string.length();i++){
            char letters = string.charAt(i);
            if(Character.isLetter(letters)){
                number += getNumber(letters);
                letterString += letters;
            }
        }
        System.out.println(string.replaceAll(letterString,number));
        input.close();
    }
    public static int getNumber(char ch){
        if(Character.toUpperCase(ch) == 'A' || Character.toUpperCase(ch) == 'B' || Character.toUpperCase(ch) == 'C')
            return 2;
        else if(Character.toUpperCase(ch) == 'D' || Character.toUpperCase(ch) == 'E' || Character.toUpperCase(ch) == 'F')
            return 3;
        else if(Character.toUpperCase(ch) == 'G' || Character.toUpperCase(ch) == 'H' || Character.toUpperCase(ch) == 'I')
            return 4;
        else if(Character.toUpperCase(ch) == 'J' || Character.toUpperCase(ch) == 'K' || Character.toUpperCase(ch) == 'L')
            return 5;
        else if(Character.toUpperCase(ch) == 'M' || Character.toUpperCase(ch) == 'N' || Character.toUpperCase(ch) == 'O')
            return 6;
        else if(Character.toUpperCase(ch) == 'P' || Character.toUpperCase(ch) == 'Q' || Character.toUpperCase(ch) == 'R' || Character.toUpperCase(ch) == 'S')
            return 7;
        else if(Character.toUpperCase(ch) == 'T' || Character.toUpperCase(ch) == 'U' || Character.toUpperCase(ch) == 'V')
            return 8;
        else if(Character.toUpperCase(ch) == 'W' || Character.toUpperCase(ch) == 'X' || Character.toUpperCase(ch) == 'Y' || Character.toUpperCase(ch) == 'Z')
            return 9;
        else
            return 0;
    }
}
