package Chapter7;

public class ComputeGcd {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int[] numbers = new int[5];
        System.out.print("Enter 5 integers: ");
        int i = 0;
        while(i<numbers.length){
            numbers[i] = input.nextInt();
            i++;
        }
        conditionTrue2(numbers);
        input.close();
    }
    public static int gcd(int num1, int num2){
        int gcd = 1;
        int k = 2;
        while(num1 >= k && num2 >= k){
            if(num1 % k == 0 && num2 % k == 0)
                gcd = k;
            k++;
        }
        return gcd;
    }
    public static int[] conditionTrue1(int... numbers){
        int[] result = new int[50];
        for(int i = 0;i<numbers.length-1;i++){
            for(int j = 0;j<numbers.length-1;j++){
                result[i] = gcd(numbers[i], numbers[j]);
            }
        }
        return result;
    }
    public static void conditionTrue2(int... numbers){
        int[] result = conditionTrue1(numbers);
        System.out.println(java.util.Arrays.toString(result));
    }
}
