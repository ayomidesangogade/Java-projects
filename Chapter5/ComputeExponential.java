package Chapter5;

public class ComputeExponential {
    public static void main(String[]args){
        double e = 1;
        for(int i = 1;i<=20;i++){
            e += (double)1/factorial(i);
        }
        System.out.println("e is "+e);
    }
    
    public static int factorial(int n){
        if(n == 0 || n == 1)
            return 1;
        else
            return n*factorial(n - 1);
    }
}