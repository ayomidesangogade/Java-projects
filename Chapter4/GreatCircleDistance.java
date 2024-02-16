package Chapter4;

public class GreatCircleDistance {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.printf("The distance between the two points is %.3f km",greatCircleDistance(x1, y1, x2, y2));
        input.close();
    }
    public static double greatCircleDistance(double x1, double y1, double x2, double y2){
        final double RADIUS = 6371.01;
        double r = RADIUS*Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2))+Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*Math.cos(Math.toRadians(y1-y2)));
        return r;
    }
}
