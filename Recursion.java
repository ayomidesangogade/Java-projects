
public class Recursion {
    public static void main(String[] args){
        System.out.println(add(8,9));
    }
    public static int add(int num, int num2){
        if(num2 == 0)
            return num;
        else
            return 1+add(num, num2-1);
    }
}