package Chapter6;

public class AreaOfAPentagon {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        System.out.println("The area of the pentagon is "+area(side));
        input.close();
    }
    public static double area(double side){
        double area = 5*Math.pow(side,2)/(4*Math.tan(Math.PI/5));
        return area;
    }
}
