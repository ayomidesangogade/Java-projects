package Chapter7;

public class BubbleSort {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        double[] list = new double[10];
        int i = 0;
        System.out.print("Enter 10 double numbers: ");
        while(i<list.length){
            list[i] = input.nextDouble();
            i++;
        }
        bubbleSort(list);
        input.close();
    }
    public static void bubbleSort(double[] list){
        double temp = 0;
        for(int i = 1;i<list.length;i++){
            for(int j = 1; j<list.length;j++){
                if(list[j] < list[j-1]){
                    temp = list[j]; list[j] = list[j-1]; list[j-1] = temp;
                }
            }
        }
        System.out.print("The sorted list is: ");
        System.out.println(java.util.Arrays.toString(list));
    }
}
