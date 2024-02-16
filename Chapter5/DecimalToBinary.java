package Chapter5;

public class DecimalToBinary {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter decimal: ");
        int decimal = input.nextInt();

        String binary = "";
        while(decimal != 0){
            int remainder = decimal%2;
            binary += remainder;
            decimal /= 2;
        }
        System.out.println("The decimal in binary is "+binary);
        input.close();
    }
}
