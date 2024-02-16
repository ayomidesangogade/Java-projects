package Chapter4;

public class Ascii{
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        byte ascii = input.nextByte();
        char ch = (char)ascii;
        System.out.println("The character for ASCII code "+ascii+" is "+ch);
        input.close();
    }
}