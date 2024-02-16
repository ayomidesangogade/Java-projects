package Chapter7;

public class StrictlyIdenticalArrays {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter list1 size and contents: ");
        int n = input.nextInt();
        int[] list1 = new int[n];
        int i = 0;
        while(i<n){
            list1[i] = input.nextInt();
            i++;
        }
        System.out.print("Enter list2 size and contents: ");
        int n1 = input.nextInt();
        int[] list2 = new int[n1];
        int j = 0;
        while(j<n){
            list2[j] = input.nextInt();
            j++;
        }
        displayMessage(list1, list2);
        input.close();
    }
    public static boolean equals(int[] list1, int[] list2){
        if(java.util.Arrays.equals(list1,list2))
            return true;
        else
            return false;
    }
    public static void displayMessage(int[] list1, int[] list2){
        if(equals(list1, list2))
            System.out.println("The two lists are strictly identical");
        else
            System.out.println("The two lists are not strictly identical");
    }
}
