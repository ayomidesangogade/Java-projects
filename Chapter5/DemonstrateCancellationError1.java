package Chapter5;

public class DemonstrateCancellationError1 {
    public static void main(String[]args){
        double sum = 0;
        for(int n = 1; n<= 50000; n++){
            sum += 1/(double)n;
        }
        System.out.println("Sum is "+sum);
    }
}
