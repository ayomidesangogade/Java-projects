package Chapter3;

public class Max {
    public static int max(int i,int j){
        if (i > j)
            return i;
        else
            return j;
    }

    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter first number: ");
        int i = input.nextInt();

        System.out.print("Enter second number: ");
        int j = input.nextInt();

        System.out.println("The maximum of "+i+" and "+j+" is "+max(i,j));
        input.close();
    }
}
