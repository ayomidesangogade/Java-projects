package Chapter7;

public class LockersPuzzle {
    public static void main(String[] args){
        boolean[] list = new boolean[100];
        printList(list);
    }
    public static boolean[] first(boolean[] list){
        boolean[] result = new boolean[list.length];
        for(int i = 0;i<list.length;i++){
            result[i] = true;
        }
        return result;
    }
    public static boolean[] second(boolean[] list){
        boolean[] result = first(list);
        for(int i = 2;i<list.length;i+=2){
            result[i] = false;
        }
        return result;
    }
    public static void printList(boolean[] list){
        boolean[] result = second(list);
        for(int i = 2;i<list.length;i++){
            for(int j = i; j<list.length;j+=i){
                if(result[j] == true)
                    result[j] = false;
                else
                    result[j] = true;
            }
        }
        System.out.println(java.util.Arrays.toString(result));
    }
}
