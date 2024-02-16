package Chapter7;

public class FindTheIndexOfTheSmallestElement {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        double[] numbers = new double[10];
        System.out.print("Enter 10 numbers: ");
        int i = 0;
        while(i<numbers.length){
            numbers[i] = input.nextDouble();
            i++;
        }
        System.out.println("The index of the smallest element "+FindTheSmallestNumber.min(numbers)+" is "+indexOfSmallestElement(numbers));
        input.close();
    }
    public static int indexOfSmallestElement(double[] array){
        double min = array[0];
        int index = 0;
        for(int i = 0;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
