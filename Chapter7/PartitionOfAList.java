package Chapter7;

public class PartitionOfAList {
    public static void main(String[] args){

    }
    public static int partition(int[] list){
        int pivot = list[0];

        for(int i = 1;i<list.length;i++){
            if(list[i] < pivot)
                pivot = list[i];
        }
        return pivot;
    }
    // public static int[] firstPart(int[] list){
    //     int[] result = new int[list.length];
    //     int index = 0;
    //     for(int i = 0; i<list.length;i++){
    //         if(list)
    //     }
    // }
}
