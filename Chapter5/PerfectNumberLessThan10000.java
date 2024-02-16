package Chapter5;

public class PerfectNumberLessThan10000 {
    public static void main(String[]args){
        int i = 1;
        while(i <= 10000){
            if(perfectNumberChecker(i))
                System.out.println(i);
            i++;
        }
    }
    public static boolean perfectNumberChecker(int n){
        int sum = 0;
        for(int i = 1;i<n;i++){
            if(n%i == 0)
                sum += i;
        }
        if(n == sum)
            return true;
        else
            return false;
    }
}
