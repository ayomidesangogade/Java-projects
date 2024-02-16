package Chapter6;

public class CreditNumberValidation {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");
        long number = input.nextLong();
        System.out.println((isValid(number)) ? number+" is valid" : number+" is invalid");
        input.close();
    }
    public static boolean isValid(long number){
        if(prefixMatched(number) && getSize(number) == 13 || getSize(number) == 16){
            if(getDigit(number) % 10 == 0)
                return true;
            else
                return false;
        }
        else
            return false;
    }
    
    public static int sumOfDoubleEvenPlace(long number){
        String numString = number + "";
        int sum = 0;
        for(int i = 0;i<numString.length();i+=2){
            int digit = Integer.parseInt(numString.substring(i, i+1))*2;
            if(digit >= 10){
                int digit1 = (digit/10)+(digit%10);
                sum += digit1;
            } 
            else
                sum += digit;
        }
        return sum;
    }

    public static int getDigit(long number){
        return sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
    }
    
    public static int sumOfOddPlace(long number){
        String numString = number + "";
        int sum = 0;
        for(int i = 1;i<numString.length();i+=2){
            sum += Integer.parseInt(numString.substring(i, i+1));  
        }
        return sum;
    }

    public static boolean prefixMatched(long number){
        if(getPrefix(number,1) == 4 || getPrefix(number,1) == 5 || getPrefix(number,1) == 6 || getPrefix(number, 2) == 37)
            return true;
        else
            return false;
    }
    
    public static int getSize(long d){
        String numString = d + "";
        return numString.length();
    }

    public static int getPrefix(long number, int k){
        String numString = number + "";
        return Integer.parseInt(numString.substring(0,k));
    }
}
