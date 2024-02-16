package Chapter5;

public class DecimalToOctal {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter decimal: ");
        int decimal = input.nextInt();

        String octal = "";
        while(decimal != 0){
            int remainder = decimal % 8;
            octal += remainder;
            decimal /= 8;
        }
        System.out.println("Decimal to octal is "+octal);
        input.close();
    }
}
