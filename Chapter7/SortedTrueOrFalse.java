package Chapter7;

public class SortedTrueOrFalse {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the size of the list: ");
        int n = input.nextInt();

        int[] list = new int[n];
        System.out.print("Enter the contents of the list: ");
        for(int i = 0;i<list.length;i++){
            list[i] = input.nextInt();
        }
        confirmer(list);
        input.close();
    }
    public static boolean isSorted(int[] list){
        int[] result = new int[list.length];
        for(int i = 0;i<list.length;i++){
            result[i] = list[i];
        }
        java.util.Arrays.sort(result);
        return java.util.Arrays.equals(list,result);
    }
    public static void confirmer(int[] list){
        System.out.print("The list has "+list.length+" integers ");
        for(int item: list)
            System.out.print(item+" ");
        System.out.println((isSorted(list)) ? "\nThe list is already sorted" : "\nThe list is not sorted");
    }
}
