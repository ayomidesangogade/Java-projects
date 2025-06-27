package Exercises;

public class CramersRule {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        double denominator = (a*d - b*c);
        double x = (e*d - b*f)/denominator;
        double y = (a*f - e*c)/denominator;
        if (denominator == 0)
            System.out.println("The equation has no solution.");
        else
            System.out.println("x is "+(int)(x*100)/100.0+" and y is "+(int)(y*100)/100.0);
        input.close();
    }
}
