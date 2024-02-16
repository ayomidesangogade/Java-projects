package Chapter3;

public class PointsInACircle {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double distance = Math.pow(x,2) + Math.pow(y,2);
        double distanceSquared = Math.sqrt(distance);
        if (distanceSquared<=10)
            System.out.println("Point ("+x+", "+y+") is in the circle.");
        else
            System.out.println("Point ("+x+", "+y+") is not in the circle.");
        input.close();
    }
}
