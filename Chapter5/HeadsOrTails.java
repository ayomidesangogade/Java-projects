package Chapter5;

public class HeadsOrTails {
    public static void main(String[]args){
        int head = 0;
        int tail = 0;
        for(int i = 0; i<= 1000000; i++){
            int flip = (int)(Math.random()*2);
            if(flip == 1)
                head++;
            else
                tail++;
        }
        System.out.println("There number of heads is "+head+" and the number of tails is "+tail);
    }
}
