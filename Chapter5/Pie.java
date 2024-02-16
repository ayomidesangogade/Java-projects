package Chapter5;

public class Pie {
    public static void main(String[]args){
        double pie = 0;
        for(int i = 1; i<=10000;i++){
            pie += Math.pow(-1,i+1)/(double)(2*i - 1);
        }
        System.out.println("Pie is "+(4*pie));
    }
}
