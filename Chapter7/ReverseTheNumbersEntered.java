package Chapter7;

public class ReverseTheNumbersEntered {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter ten numbers: ");
        for(int i = 0;i<numbers.length;i++)
            numbers[i] = input.nextDouble();
        reverse(numbers);
        input.close();
    }
    public static void reverse(double... numbers){
        double[] result = new double[numbers.length];
        for(int i = 0,j = numbers.length-1;i<numbers.length;i++,j--)
            result[i] = numbers[j];
        System.out.println(java.util.Arrays.toString(result));
    }
}
