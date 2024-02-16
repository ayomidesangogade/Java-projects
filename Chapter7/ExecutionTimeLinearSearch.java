package Chapter7;

public class ExecutionTimeLinearSearch {
    public static void main(String[] args){
        int[] list = generate100000RandomNumbers();
        int key = 1+(int)(Math.random()*9999);
        long startTime = System.nanoTime();
        linearSearch(list, key);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Execution Time: "+executionTime);
    }
    public static int[] generate100000RandomNumbers(){
        int[] result = new int[100000];

        for(int i = 0; i<100000;i++){
            int random = 1 + (int)(Math.random()*9999);
            result[i] = random;
        }
        return result;
    }
    public static void linearSearch(int[] list, int key){
        for(int i = 0;i<list.length;i++){
            if(key == list[i])
                System.out.println(i);
        }
    }
}
