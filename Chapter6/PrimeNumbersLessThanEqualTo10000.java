package Chapter6;

public class PrimeNumbersLessThanEqualTo10000 {
    public static void main(String[]args){
        int i = 2;
        while(i<= 10000){
            if(isPrime(i))
                System.out.println(i);
            i++;
        }

    }
    public static boolean isPrime(int number){
        int i = 2;
        while(i<number && number % i != 0){
            i++;
        }
        if(number == i)
            return true;
        else
            return false;
    }
}
