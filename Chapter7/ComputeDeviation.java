package Chapter7;

public class ComputeDeviation {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter 10 numbers: ");
        int i = 0;
        while(i<numbers.length){
            numbers[i] = input.nextDouble();
            i++;
        }
        System.out.println("The mean is "+Math.round(mean(numbers)*100)/100.0);
        System.out.println("The standard deviation is "+Math.round(deviation(numbers)*100000)/100000.0);
        input.close();
    }
    public static double mean(double[] numbers){
        double sum = 0;
        for(int i = 0; i<numbers.length;i++)
            sum += numbers[i];
        return sum/numbers.length;
    }
    public static double deviation(double[] numbers){
        double numerator = 0;
        for(int i = 0;i<numbers.length;i++)
            numerator += Math.pow((numbers[i]-mean(numbers)), 2);
        return Math.sqrt(numerator/(numbers.length-1));
    }
}
