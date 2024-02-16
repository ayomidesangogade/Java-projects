package Chapter3;

public class TwoCircles {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        double circle1X = input.nextDouble();
        double circle1Y = input.nextDouble();
        double circle1Radius = input.nextDouble();

        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        double circle2X = input.nextDouble();
        double circle2Y = input.nextDouble();
        double circle2Radius = input.nextDouble();

        double distanceBetweenTwoCenters = Math.sqrt((Math.pow((circle2X - circle1X),2)+Math.pow((circle2Y - circle1Y),2)));

        if(distanceBetweenTwoCenters <= Math.abs((circle1Radius - circle2Radius)))
            System.out.println("circle2 is inside circle1");
        else if (distanceBetweenTwoCenters <= (circle1Radius + circle2Radius))
            System.out.println("circle2 overlaps circle1");
        else
            System.out.println("circle2 does not overlap circle1");
        input.close();
    }
}