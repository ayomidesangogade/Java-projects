package Chapter6;

public class MersennePrime {
    public static void main(String[]args){
        int i = 2;
        System.out.println("p\t\t2^p-1");
        System.out.println("-------------------------");
        while(i<=32){
            if(isPrime(i))
                System.out.println(i+"\t\t"+(int)(Math.pow(2,i)-1));
            i++;
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
