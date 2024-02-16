package Chapter7;

public class SumIntegers {
    public static void main(String[] args){
        int sum = 0;

        for(int i = 0; i<args.length;i++){
            sum += Integer.parseInt(args[i]);
        }

        System.out.println("The sum of the numbers is "+sum);
    }
}
