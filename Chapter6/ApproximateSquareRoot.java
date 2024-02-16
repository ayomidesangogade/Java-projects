package Chapter6;

public class ApproximateSquareRoot{
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a positive double value: ");
        double n = input.nextDouble();

        System.out.println("The square root of the number is "+sqrt(n));
        input.close();
    }
    public static double sqrt(double n){
        double lastGuess = 1.0;
        double nextGuess = 0;
        while(true){
            nextGuess = (lastGuess + n / lastGuess) / 2.0;
            if(Math.abs(nextGuess - lastGuess) < 0.0001){
                return nextGuess;
            }
            double temp = nextGuess; nextGuess = lastGuess; lastGuess = temp;
        }    
    }
}