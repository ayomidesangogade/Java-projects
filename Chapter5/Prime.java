package Chapter5;

public class Prime {
    public static void main(String[]args){
        int count = 0;
        for(int num = 2;num<=1000;num++){
            if(isPrime(num)){
                count++;
                if(count%8 == 0)
                    System.out.println(num);
                else
                    System.out.print(num+" ");
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
