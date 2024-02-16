package Chapter7;

public class PrimeNumber {
    public static void main(String[] args){
        int[] primes = new int[50];

        int count = 0;
        int i = 2;
        while(count < 50){
            if(isPrime(i)){
                count++;
                primes[count - 1] = i;
            }
            i++;   
        }
        System.out.println(java.util.Arrays.toString(primes));
    }
    public static boolean isPrime(int num){
        int i = 2;
        while(num % i != 0 && i<num){
            i++;
        }
        if(num == i)
            return true;
        else
            return false;
    }
}
