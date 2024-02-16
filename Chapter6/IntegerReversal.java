package Chapter6;

public class IntegerReversal {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        reverse(number);
        input.close();
    }
    public static void reverse(int number){
        String numString = number + "";
        String reversedString = "";
        int index = numString.length()-1;
        while(index >= 0){
            reversedString += numString.charAt(index);
            index--;
        }
        System.out.println("The reversal of the number is "+reversedString);
    }
}
