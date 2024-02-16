package Chapter5;

public class Palindrome {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter string: ");
        String s = input.nextLine();

        int low = 0;
        int high = s.length()-1;

        boolean isPalindrome = true;
        while(low < high){
            if(s.charAt(low) != s.charAt(high)){
                isPalindrome = false;
                break;
            }

            low++;
            high--;
        }
        if(isPalindrome)
            System.out.println(s+" is a palindrome.");
        else
            System.out.println(s+" is not a palindrome.");
        input.close();
    }
}
