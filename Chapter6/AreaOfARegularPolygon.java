package Chapter6;

public class AreaOfARegularPolygon {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();

        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        System.out.println("The area of the polygon is "+area(n, side));
        input.close();
    }
    public static double area(int n, double side){
        double area = n*Math.pow(side,2)/(4*Math.tan(Math.PI/5));
        return area;
    }
}
