package Chapter6;

public class PalindromeInteger {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = input.nextInt();

        if(isPalindrome(integer))
            System.out.println(integer+" is a palindrome.");
        else
            System.out.println(integer+" is not a palindrome.");
        input.close();
    }
    public static int reverse(int number){
        String numString = number + "";
        String reversedNumber = "";
        int index = numString.length()-1;
        while(index >= 0){
            reversedNumber += numString.charAt(index);
            index--;
        }
        return Integer.parseInt(reversedNumber);
    }
    public static boolean isPalindrome(int number){
        if(number == reverse(number))
            return true;
        else
            return false;
    }
}
