package Chapter3;

public class PointOnLineSegment {
    public static double pointOnLineSegment(double x0, double y0, double x1, double y1, double x2, double y2){
        double pointOnLine = (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);
        return pointOnLine;
    }

    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        if(pointOnLineSegment(x0, y0, x1, y1, x2, y2) == 0)
            System.out.println("("+x2+", "+y2+") is on the line segment from ("+x0+", "+y0+") to ("+x1+", "+y1+")");
        else
            System.out.println("("+x2+", "+y2+") is not on the line segment from ("+x0+", "+y0+") to ("+x1+", "+y1+")");
        input.close();
    }
}
