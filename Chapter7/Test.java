package Chapter7;


public class Test {
    public static void main(String[]args){
        for(int i = 0;i<4;i++){
            System.out.println(" | "+i);
            for(int j = 0;j<4;j++){
                System.out.print((i*j)+" ");
            }
            System.out.println();
        }
    }
    public static void eliminateDuplicates(int[] list){
        // int[] result = new int[list.length];
        int index = 1;

        for(int i = 0; i<3;i++){
            // boolean isDuplicate = false;

            for(int j = 0; j<index;j++){
                // if(list[i] == result[j]){
                //     isDuplicate = true;
                //     break;
                // }
                System.out.println(i+" "+j);
            }
            index++;
            // if(!isDuplicate){
            //     result[index] = list[i];
            //     index++;
            // }
        }

        // return Arrays.copyOf(result,index);
    }   
}
