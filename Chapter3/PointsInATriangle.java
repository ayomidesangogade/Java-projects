package Chapter3;

public class PointsInATriangle{
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        
        double x1 = 0, y1 = 0;
        double x2 = 200, y2 = 0;
        double x3 = 0, y3 = 100;

        double area1 = 0.5* Math.abs(x1*(y2 - y3)+x2 * (y3 - y1)+x3*(y1 - y2));
        double area2 = 0.5 * (x*(y2 - y3)+x2*(y3 - y)+x3 * (y - y2));
        double area3 = 0.5 * (x1 * (y - y3) + x * (y3 - y1) + x3 * (y1 - y));

        double subArea = Math.abs(area2 + area3);
        
        if (subArea - area1 <= 1e-14)
            System.out.println("The point is in the triangle.");
        else
            System.out.println("The point is not in the triangle.");
        input.close();
    }
}