package Chapter4;

public class ProcessAString {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        System.out.println("The length of the string is "+string.length());
        System.out.println("The first character in the string is "+string.charAt(0));
        input.close();
    }
}
