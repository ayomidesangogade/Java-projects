package Chapter7;

public class AverageAnArray {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int[] numbers = new int[10];

        int i = 0;
        System.out.print("Enter ten integers: ");
        while(i<numbers.length){
            numbers[i] = input.nextInt();
            i++;
        }
        System.out.println("The average is "+average(numbers));
        input.close();
    }
    public static double average(double... numbers){
        double sum = 0;
        for(int i = 0; i<numbers.length;i++)
            sum += numbers[i];
        return sum/2;
    }
    public static double average(int... numbers){
        int sum = 0;
        for(int i = 0; i<numbers.length;i++)
            sum += numbers[i];
        return sum/2.0;
    }
}
