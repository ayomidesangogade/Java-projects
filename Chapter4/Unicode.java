package Chapter4;

public class Unicode {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a character: ");
        String character = input.nextLine();
        int unicode = (int)character.charAt(0);
        System.out.println("The Unicode for the character "+character+" is "+unicode);
        input.close();
    }
}
