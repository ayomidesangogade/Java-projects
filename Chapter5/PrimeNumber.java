package Chapter5;

public class PrimeNumber{
    public static void main(String[]args){
        final int NUMBER_OF_PRIME_NUMBERS = 50;
        final int NUMBER_OF_PRIME_NUMBERS_PER_LINE = 10;
        int count = 0;
        int number = 2;
        System.out.println("The first 50 prime numbers are \n");
        while(count < NUMBER_OF_PRIME_NUMBERS){
            if(isPrime(number)){
                count++;
                if(count%NUMBER_OF_PRIME_NUMBERS_PER_LINE == 0)
                    System.out.println(number);
                else
                    System.out.print(number+" ");
            }
            number++;
        }
    }

    public static boolean isPrime(int number){
        int i = 2;
        while (i<number && number % i != 0){
                i++;
            }
            if(number == i)
                return true;
            else
                return false;
    }
}
