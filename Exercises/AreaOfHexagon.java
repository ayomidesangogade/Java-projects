package Exercises;

import java.util.Scanner;
public class AreaOfHexagon{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of side: ");
        double s = input.nextDouble();
        double area = ((3*Math.sqrt(3))/2)*Math.pow(s,2);
        System.out.println("The area of the hexagon is "+(float)area);
        input.close();
    }
}