package Chapter4;

public class Isbn {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String isbnNumber = input.nextLine();
        isbnNumberChecker(isbnNumber);
        input.close();
    }
    public static void isbnNumberChecker(String isbnNumber){
        char d1Ch = isbnNumber.charAt(0);
        String d1 = d1Ch + "";
        int d1Num = Integer.parseInt(d1);
        char d2Ch = isbnNumber.charAt(1);
        String d2 = d2Ch + "";
        int d2Num = Integer.parseInt(d2);
        char d3Ch = isbnNumber.charAt(2);
        String d3 = d3Ch + "";
        int d3Num = Integer.parseInt(d3);
        char d4Ch = isbnNumber.charAt(3);
        String d4 = d4Ch + "";
        int d4Num = Integer.parseInt(d4);
        char d5Ch = isbnNumber.charAt(4);
        String d5 = d5Ch + "";
        int d5Num = Integer.parseInt(d5);
        char d6Ch = isbnNumber.charAt(5);
        String d6 = d6Ch + "";
        int d6Num = Integer.parseInt(d6);
        char d7Ch = isbnNumber.charAt(6);
        String d7 = d7Ch + "";
        int d7Num = Integer.parseInt(d7);
        char d8Ch = isbnNumber.charAt(7);
        String d8 = d8Ch + "";
        int d8Num = Integer.parseInt(d8);
        char d9Ch = isbnNumber.charAt(8);
        String d9 = d9Ch + "";
        int d9Num = Integer.parseInt(d9);
        
        int x = (d1Num * 1 + d2Num * 2 + d3Num * 3 + d4Num * 4 + d5Num * 5 +d6Num * 6 + d7Num * 7 + d8Num * 8 + d9Num * 9) % 11;
        if (x == 10)
            System.out.println("The ISBN-10 number is "+d1+d2+d3+d4+d5+d6+d7+d8+d9+"X");
        else
            System.out.println("The ISBN-10 number is "+d1+d2+d3+d4+d5+d6+d7+d8+d9+x);
    }
}
