package Chapter5;

public class NumversDivisibleBy5and6ButNotBoth {
    public static void main(String[]args){
        int i = 100;
        int count = 0;
        while(i <= 200){
            if(i%5 == 0 ^ i%6 == 0){
                count++;
                if(count%10 == 0)
                    System.out.println(i);
                else
                    System.out.print(i+" ");
            }
            i++;
        }
    }
}
