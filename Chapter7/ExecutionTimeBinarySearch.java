package Chapter7;

public class ExecutionTimeBinarySearch {
    public static void main(String[] args){
        int[] list = generate100000RandomNumbers();
        int key = 1+(int)(Math.random()*9999);
        long startTime = System.nanoTime();
        System.out.println("The index of the key is "+binarySearch(list,key));
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Execution Time: "+executionTime);
    }
    public static int[] generate100000RandomNumbers(){
        int[] result = new int[100000];

        for(int i = 0;i<100000;i++){
            int random = 1 + (int)(Math.random()*9999);
            result[i] = random;
        }
        return result;
    }
    public static int binarySearch(int[] list, int key){
        java.util.Arrays.parallelSort(list);

        int low = 0;
        int high = list.length-1;

        while(high >= low){
            int mid = (low+high)/2;
            if(key > list[mid])
                high = mid - 1;
            else if(key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -low-1;
    }
}