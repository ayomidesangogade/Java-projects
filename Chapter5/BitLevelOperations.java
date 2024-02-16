package Chapter5;

public class BitLevelOperations {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter an integer: ");
        short integer = input.nextShort();

        System.out.print("The bits are ");
        displayBits(integer);
        input.close();
    }
    public static void displayBits(short integer){
        int mask = 1 >> 15;

        for(int i = 1; i <= 16; i++){
            System.out.print((integer & mask) == 0 ? '0' : '1');

            integer >>= i;
        }
        System.out.println();
    }
}
