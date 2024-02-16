package Chapter6;

public class AreaOfATriangle {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter side1: ");
        double side1 = input.nextDouble();
        System.out.print("Enter side2: ");
        double side2 = input.nextDouble();
        System.out.print("Enter side3: ");
        double side3 = input.nextDouble();

        if(isValid(side1, side2, side3))
            System.out.printf("The area of the triangle is %.2f\n",area(side1, side2, side3));
        else
            System.out.println("Inputs are Invalid.");
        input.close();
    }
    public static boolean isValid(double side1, double side2, double side3){
        if((side1+side2)>side3)
            return true;
        else if((side1+side3)>side2)
            return true;
        else if((side2+side3)>side1)
            return true;
        else
            return false;
    }
    public static double area(double side1, double side2, double side3){
        double s = (side1 + side2 + side3)/2;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }
}