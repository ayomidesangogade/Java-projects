package Chapter7;

public class BinarySearch {
    public static void main(String[] args){
        int [] myList = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int[] list = reverse(myList);
        java.util.Arrays.parallelSort(list);
        System.out.println(java.util.Arrays.toString(list));
        // int[] chars = {2, 4, 7, 10};
        // int[] list2 = {4, 2, 7, 10};
        java.util.Arrays.fill(list,1,8,7);
        System.out.println(java.util.Arrays.toString(list));
    }
    public static int[] reverse(int[] list){
        int[] result = new int[list.length];
        for(int i = 0, j = list.length-1; i<list.length;i++,j--)
            result[i] = list[j];
        return result;
    }
}
