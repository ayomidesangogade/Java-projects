package Chapter4;

public class HexToBinary {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hexString = input.nextLine();

        if(hexString.length() != 1){
            System.out.println("Input must be exactly a character.");
            System.exit(1);
        }
        hexToBinaryConverter(hexString);
        input.close();
    }
    public static void hexToBinaryConverter(String hexString){
        char ch = hexString.charAt(0);
        if (ch >= '0' && ch <= '9'){
            int number = ch - '0';
            String binary = "";
            while(number != 0){
                int binaryValue = number % 2;
                binary += binaryValue;
                number /= 2;
            }
            System.out.println("The binary value is "+binary);
        }
        else if (Character.toUpperCase(ch) >= 'A' && Character.toUpperCase(ch) <= 'F'){
            int number = Character.toUpperCase(ch) - 'A' + 10;
                String binary = "";
                while(number != 0){
                    int binaryValue = number % 2;
                    binary += binaryValue;
                    number = number / 2;
                }
            System.out.println("The binary value is "+binary);
        }
        else
            System.out.println("Invalid Input.");
    }
}
