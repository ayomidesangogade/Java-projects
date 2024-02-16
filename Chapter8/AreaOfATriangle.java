package Chapter8;

public class AreaOfATriangle {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        double[][] points = new double[3][2];
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        for(int i = 0;i<points.length;i++){
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
        if(getTriangleArea(points) >= 0.1)
            System.out.println("The area of the triangle is "+Math.round(getTriangleArea(points)*100)/100.0);
        else
            System.out.println("The three points are on the same line");
        input.close();
    }
    public static double getTriangleArea(double[][] points){
        double side1 = FindNearestPoints.distance(points[0][0], points[0][1], points[1][0], points[1][1]);
        double side2 = FindNearestPoints.distance(points[0][0], points[0][1], points[2][0], points[2][1]);
        double side3 = FindNearestPoints.distance(points[1][0], points[1][1], points[2][0], points[2][1]);

        double s = (side1+side2+side3)/2;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }
}
