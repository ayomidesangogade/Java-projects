package Chapter7;

public class EliminateDuplicates {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter 10 numbers: ");
        int i = 0;
        while(i<numbers.length){
            numbers[i] = input.nextInt();
            i++;
        }
        int[] list = eliminateDuplicates(numbers);
        distinct(list);
        input.close();
    }
    public static int[] eliminateDuplicates(int[] list){
        int[] result = new int[list.length];
        int index = 0;

        for(int i = 0;i<list.length;i++){
            boolean isDuplicate = false;

            for(int j = 0; j<index;j++){
                if(list[i] == result[j]){
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate){
                result[index] = list[i];
                index++;
            }
        }
        return java.util.Arrays.copyOf(result, index);
    }
    public static void distinct(int[] list){
        System.out.print("The distinct numbers are: ");
        for(int item: list){
            System.out.print(item+" ");
        }
    }
}
