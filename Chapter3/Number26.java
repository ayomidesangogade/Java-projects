package Chapter3;

public class Number26 {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = input.nextInt();
        System.out.println((integer % 5 == 0 && integer % 6 == 0) ? "Is "+integer+" divisible by 5 and 6? "+(integer % 5 == 0 && integer % 6 == 0) : "Is "+integer+" divisible by 5 and 6? false");
        System.out.println((integer % 5 == 0 || integer % 6 == 0) ? "Is "+integer+" divisible by 5 or 6? "+(integer % 5 == 0 || integer % 6 == 0) : "Is "+integer+" divisible by 5 or 6? false");
        System.out.println((integer % 5 == 0 ^ integer % 6 == 0) ? "Is "+integer+" divisible by 5 or 6, but not both? "+(integer % 5 == 0 ^ integer % 6 == 0) : "Is "+integer+" divisible by 5 and 6, but not both? false");
        input.close();
    }
}
