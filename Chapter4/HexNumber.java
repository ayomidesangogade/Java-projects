package Chapter4;

public class HexNumber {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        int number = input.nextInt();
        hex(number);
        input.close();
    }
    public static void hex(int number){
        if (number >= 0 && number <= 9)
            System.out.println("The hex value is "+number);
        else if(number >= 10 && number <= 15){
            char ch = (char)(number - 10 + 'A');
            System.out.println("The hex value is "+ch);
        }
        else
            System.out.println(number+" is an invalid input.");
    }
}
