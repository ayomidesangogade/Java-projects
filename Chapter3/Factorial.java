package Chapter3;

public class Factorial {
    public static int factorial(int num){
        int factorial = 1;
        for(int i = 1;i<=num;i++){
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter number: ");
        int num = input.nextInt();
        System.out.println(num+"! is "+factorial(num));

        input.close();
    }
}
