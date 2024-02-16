package Chapter4;

public class RandomPointsOnACircle{
    public static void main(String[]args){
        int random = (int)(Math.random()*360);
        double randomAngle = Math.toRadians(random);
        int radius = 40;
        double x = radius*Math.cos(randomAngle);
        double y = radius*Math.sin(randomAngle);
        System.out.println("The point of the circle is ("+x+","+y+")");
    }
}