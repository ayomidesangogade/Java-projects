package Chapter5;

public class Isbn {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String isbn = input.nextLine();

        int d = 0;
        for(int i= 0; i<=isbn.length()-1; i++){
            d += Integer.parseInt(isbn.substring(i, i+1)) * (i+1);
        }
        int d10 = d%11;
        if(d10 == 10)
            System.out.println("The ISBN-10 number is "+isbn+"X");
        else
            System.out.println("The ISBN-10 number is "+isbn+d10);
        input.close();
    }
}
