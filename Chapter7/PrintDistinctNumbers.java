package Chapter7;

public class PrintDistinctNumbers {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter 10 numbers: ");
        for(int i = 0; i<numbers.length;i++)
            numbers[i] = input.nextDouble();

        displayCounts(numbers);
        input.close();
    }
    public static double[] distinct(double[] numbers){
        double[] result = new double[numbers.length];
        int index = 0;

        for(int i = 0;i<numbers.length;i++){
            boolean isDuplicate = false;

            for(int j = 0; j<index;j++){
                if(numbers[i] == result[j]){
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate){
                result[index] = numbers[i];
                index++;
            }
        }
        return java.util.Arrays.copyOf(result,index);
    }
    public static void displayCounts(double[] numbers){
        double [] result = distinct(numbers);

        System.out.println("The number of distinct numbers is "+result.length);
        System.out.print("The distinct numbers are: ");
        for(double item: result){
            if(item != 0)
                System.out.print(item+" ");
        }
    }
}
