package Chapter7;

public class ReverseArray {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int[] list = new int[10];
        System.out.print("Enter 10 integers: ");
        int i = 0;
        while(i<list.length){
            list[i] = input.nextInt();
            i++;
        }
        reverse(list);
        input.close();
    }
    public static void reverse(int[] list){
        int[] result = new int[list.length];
        int temp = 0;
        for(int i = 0,j = list.length-1;i<list.length;i++,j--){
            temp = list[j]; list[j] = result[i]; result[i] = temp;
        }
        System.out.println(java.util.Arrays.toString(result));
    }
}
