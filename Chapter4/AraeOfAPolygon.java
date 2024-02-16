package Chapter4;

public class AraeOfAPolygon {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        System.out.printf("The area of the polygon is %.3f",areaOfPolygon(n, side));
        input.close();
    }
    public static double areaOfPolygon(int n, double side){
        double area = (n*Math.pow(side,2))/(4*Math.tan(Math.PI/n));
        return area;
    }
}
