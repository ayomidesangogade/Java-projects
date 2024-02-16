package Chapter6;

public class Emirp {
    public static void main(String[]args){
        int i = 13;
        int count = 0;
        final int NUMBER_OF_PRIME_NUMBERS = 100;
        while(count<NUMBER_OF_PRIME_NUMBERS){
                if(isPrime(i) && isEmirp(i) && isNotPalindromic(i)){
                    count++;
                    if(count % 10 == 0)
                        System.out.println(i);
                    else
                        System.out.print(i+" ");
                }
            i++;
        }
    }
    public static boolean isPrime(int num){
        int i = 2;
        while(i<num && num % i != 0){
            i++;
        }
        if(num == i)
            return true;
        else
            return false;
    }
    public static int reverse(int num){
        String numString = num + "";
        String reversedNumber = "";
        int index = numString.length()-1;
        while(index >= 0){
            reversedNumber += numString.charAt(index);
            index--;
        }
        return Integer.parseInt(reversedNumber);
    }
    public static boolean isNotPalindromic(int num){
        if(num != reverse(num))
            return true;
        else
            return false;
    }
    public static boolean isEmirp(int num){
        if(isPrime(reverse(num)))
            return true;
        else
            return false;
    }
}
// int reversed = 0;
        // while(num != 0){
        //     int digit = num%10;
        //     reversed = reversed*10 + digit;
        //     num/=10;
        // }
        // return reversed;