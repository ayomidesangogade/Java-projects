package Chapter6;

public class PalindromicPrimeNumbers {
    public static void main(String[]args){
        int i = 2;
        int count = 0;
        final int NUMBER_OF_PRIME_NUMBERS = 100;
        while(count<NUMBER_OF_PRIME_NUMBERS){
            if(isPrime(i)){
                if(isPalindromic(i)){
                    count++;
                    if(count % 10 == 0)
                        System.out.println(i);
                    else
                        System.out.print(i+" ");
                }
            }
            i++;
        }
    }
    public static boolean isPrime(int num){
        int i = 2;
        while(i<num && num%i != 0){
            i++;
        }
        if(i == num)
            return true;
        else
            return false;
    }
    public static int reverse(int num){
        String numString = num + "";
        String palindromicString = "";
        int index = numString.length() - 1;
        while(index >= 0){
            palindromicString += numString.charAt(index);
            index--;
        }
        return Integer.parseInt(palindromicString);
    }
    public static boolean isPalindromic(int num){
        if(num == reverse(num))
            return true;
        else
            return false;
    }
}
