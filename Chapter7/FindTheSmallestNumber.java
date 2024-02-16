package Chapter7;

public class FindTheSmallestNumber {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        double[] array = new double[10];
        System.out.print("Enter 10 numbers: ");
        int i = 0;
        while(i<array.length){
            array[i] = input.nextDouble();
            i++;
        }
        System.out.println("The minimum number is "+min(array));
        input.close();
    }
    public static double min(double[] array){
        double min = array[0];
        for(int i = 1;i<array.length;i++){
            if(array[i]<min)
                min = array[i];
        }
        return min;
    }
}
