package Chapter6;

public class CountLetters {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        System.out.println("The number of letters in the string is "+countLetters(string));
        input.close();
    }
    public static int countLetters(String s){
        int count = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch))
                count++;
        }
        return count;
    }
}
