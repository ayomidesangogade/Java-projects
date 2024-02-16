package Chapter5;

public class DemonstrateCancellationError2 {
    public static void main(String[]args){
        double sum = 0;
        for(int n = 50000; n>= 1;n--){
            sum += 1/(double)n;        
        }
        System.out.println("Sum is "+sum);
    }
}
