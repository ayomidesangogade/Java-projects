package Chapter4;

public class ComputeAngles {
    public static double degreesA(double x1, double y1, double x2, double y2, double x3, double y3){
        double a = Math.sqrt((Math.pow((x3 - x2),2)+Math.pow((y3 - y2), 2)));
        double b = Math.sqrt((Math.pow((x3 - x1),2)+Math.pow((y3 - y1), 2)));
        double c = Math.sqrt((Math.pow((x2 - x1),2)+Math.pow((y2 - y1), 2)));
        double A = Math.toDegrees(Math.acos((a*a - b*b - c*c)/(-2*b*c)));
        return A;
    }

    public static double degreesB(double x1, double y1, double x2, double y2, double x3, double y3){
        double a = Math.sqrt((Math.pow((x3 - x2),2)+Math.pow((y3 - y2), 2)));
        double b = Math.sqrt((Math.pow((x3 - x1),2)+Math.pow((y3 - y1), 2)));
        double c = Math.sqrt((Math.pow((x2 - x1),2)+Math.pow((y2 - y1), 2)));
        double B = Math.toDegrees(Math.acos((b*b - a*a - c*c)/(-2*a*c)));
        return B;
    }

    public static double degreesC(double x1, double y1, double x2, double y2, double x3, double y3){
        double a = Math.sqrt((Math.pow((x3 - x2),2)+Math.pow((y3 - y2), 2)));
        double b = Math.sqrt((Math.pow((x3 - x1),2)+Math.pow((y3 - y1), 2)));
        double c = Math.sqrt((Math.pow((x2 - x1),2)+Math.pow((y2 - y1), 2)));
        double C = Math.toDegrees(Math.acos((c*c - b*b - a*a)/(-2*a*b)));
        return C;
    }

    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter coordinates of three points seperated by spaces like x1 y1 x2 y2 x3 y3: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        System.out.println("The three angles are "+Math.round(degreesA(x1, y1, x2, y2, x3, y3)*100)/100.0+", "+Math.round(degreesB(x1,y1,x2,y2,x3,y3)*100)/100.0+" and "+Math.round(degreesC(x1,y1,x2,y2,x3,y3)*100)/100.0);
        input.close();
    }
}
