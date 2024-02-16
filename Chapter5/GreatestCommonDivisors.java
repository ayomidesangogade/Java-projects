package Chapter5;

public class GreatestCommonDivisors {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        System.out.println("The greatest common divisor for "+n1+" and "+n2+" is "+gcd(n1,n2));
        input.close();
    }
    public static int gcd(int n1, int n2){
        int k = 2;
        int gcd = 1;
        while(n1 >= k && n2 >= k){
            if(n1 % k == 0 && n2 % k == 0)
                gcd = k;
            k++;
        }
        return gcd;
    }
}
