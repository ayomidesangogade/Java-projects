package Chapter7;

public class Combinations {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int[] list = new int[10];
        System.out.print("Enter 10 integers: ");
        int i = 0;
        while(i<list.length){
            list[i] = input.nextInt();
            i++;
        }
        printCombinations(list);
        input.close();
    }
    public static void printCombinations(int[] list){
        for(int i = 0;i<list.length;i++){
            for(int j = i;j<list.length;j++){
                System.out.println(list[i]+" "+list[j]);
            }
        }
    }
}
