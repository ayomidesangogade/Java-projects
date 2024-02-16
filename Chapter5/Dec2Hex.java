package Chapter5;

public class Dec2Hex {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();

        String hex = "";
        if(decimal >= 1){
            while(decimal != 0){
                int hexValue = decimal % 16;

                char hexDigit = (hexValue >= 0 && hexValue <= 9) ? (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');

                hex = hexDigit+hex;
                decimal = decimal/16;
            }
            System.out.println("The hex number is "+hex);
        }
        else
            System.out.println("The hex number is 0.");
        input.close();
    }
}
