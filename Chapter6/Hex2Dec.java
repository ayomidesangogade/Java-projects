package Chapter6;

public class Hex2Dec {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        System.out.println("The decimal value for hex number "+hex+" is "+hexToDecimal(hex.toUpperCase()));
        input.close();
    }
    public static int hexToDecimal(String hex){
        int decimalValue = 0;
        for(int i = 0; i<hex.length();i++){
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }
    public static int hexCharToDecimal(char ch){
        if(ch>='A' && ch<='F')
            return (ch - 'A') + 10;
        else 
            return ch - '0';
    }
}
