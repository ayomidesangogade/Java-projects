package Chapter4;

public class AreaOfAPentagon {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double length = input.nextDouble();
        System.out.printf("The area of the pentagon is %.2f",areaOfPentagon(length));
        input.close();
    }
    public static double areaOfPentagon(double length){
        double s = 2*length*Math.sin(Math.PI/5);
        double area = (5*s*s)/(4*Math.tan(Math.PI/5));
        return area;
    }
}
