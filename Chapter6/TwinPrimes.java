package Chapter6;

public class TwinPrimes {
    public static void main(String[]args){
        for(int i = 5, j = 3; i<1000 && j < 1000; i++, j++){
            if(isPrime(i) && isPrime(j)){
                if((i - j) == 2)
                    System.out.println("("+j+", "+i+")");
            }
        }
    }
    public static boolean isPrime(int num){
        int i = 2;
        while(i<num && num % i != 0){
            i++;
        }
        if(i == num)
            return true;
        else
            return false;
    }
}
