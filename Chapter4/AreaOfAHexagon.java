package Chapter4;

public class AreaOfAHexagon {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        System.out.printf("The area of the hexagon is %.2f",areaOfHexagon(side));
        input.close();
    }
    public static double areaOfHexagon(double side){
        double area = (6*Math.pow(side,2))/(4*Math.tan(Math.PI/6));
        return area;
    }
}
