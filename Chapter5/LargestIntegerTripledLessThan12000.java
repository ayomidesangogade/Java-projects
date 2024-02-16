package Chapter5;

public class LargestIntegerTripledLessThan12000 {
    public static void main(String[]args){
        int i = 1;
        int max;
        max = 1;
        while(i<=12000){
            if(Math.pow(i, 3)<12000){
                if(i>max)
                    max = i;
            }
            i++;
        }
        System.out.println("The largest integer tripled less than 12000 is "+max);
    }
}
