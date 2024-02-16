package Chapter5;

public class Isbn13 {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String d = input.nextLine();
        if(d.length() != 12){
            System.out.println(d+" is an invalid input");
            System.exit(1);
        }

        int dSum = 0;
        for(int i = 0; i<= 11; i+=2){
            dSum += Integer.parseInt(d.substring(i, i+1));
        }
        for(int i = 1; i<= d.length()-1; i+=2){
            dSum += (Integer.parseInt(d.substring(i, i+1)) * 3);
        }
        int d13 = 10 - dSum%10;
        if(d13 == 10)
            System.out.println("The ISBN-13 number is "+d+"0");
        else
            System.out.println("The ISBN-13 number is "+d+""+d13);
        input.close();
    }
}
