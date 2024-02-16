package Chapter5;

public class OddIndex {
public static void main(String[]args){
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter a string: ");
    String string = input.nextLine();

    String formattedString = "";
    for(int i = 0; i<= string.length()-1;i+=2){
        formattedString += string.charAt(i);
    }
    System.out.println(formattedString);
    input.close();
}
}
