import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for a triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double s = ((x1*y2)-(x1*y3))+((x2*y3)-(x2*y1))+((x3*y1)-(x3*y2));
        double area = (1/2.0)*s;
        System.out.println("The area of the triangle is "+Math.abs(area)+" sq units.");
        input.close();
    }
}
