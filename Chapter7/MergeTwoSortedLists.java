package Chapter7;

public class MergeTwoSortedLists {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter list1 size and contents: ");
        int n = input.nextInt();
        int[] list1 = new int[n];

        for(int i = 0;i<list1.length;i++)
            list1[i] = input.nextInt();

        System.out.print("Enter list2 size and contents: ");
        int n1 = input.nextInt();
        int[] list2 = new int[n1];

        for(int j = 0;j<list2.length;j++)
            list2[j] = input.nextInt();
        printList1(list1);
        printList2(list2);
        sortMergedLists(list1, list2);
        input.close();
    }
    public static int[] merge(int[] list1, int[] list2){
        int n = list1.length + list2.length;
        int[] result = new int[n];

        for(int i = 0;i<list1.length;i++){
            result[i] = list1[i];
        }
        for(int j = list1.length, k = 0;j<result.length && k<list2.length;j++,k++){
            result[j] = list2[k];
        }
        return result;
    }
    public static void sortMergedLists(int[] list1, int[] list2){
        int[] result = merge(list1, list2);
        for(int i = 0;i<result.length-1;i++){
            int small = i;
            for(int j = i+1; j<result.length;j++){
                if(result[j]<result[small])
                    small = j;
            }
            int temp = result[small]; result[small] = result[i]; result[i] = temp;
        }
        System.out.print("\nThe merged list is: ");
        for(int item: result)
            System.out.print(item+" ");
    }
    public static void printList1(int[] list1){
        System.out.print("list1 is ");
        for(int i = 0;i<list1.length;i++)
            System.out.print(list1[i]+" ");
    }
    public static void printList2(int[] list2){
        System.out.print("\nlist2 is ");
        for(int i = 0;i<list2.length;i++)
            System.out.print(list2[i]+" ");
    }
}
