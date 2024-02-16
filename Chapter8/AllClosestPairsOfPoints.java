package Chapter8;

public class AllClosestPairsOfPoints {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int n = input.nextInt();
        double[][] points = new double[n][2];
        System.out.print("Enter "+n+" points: ");
        for(int i = 0;i<points.length;i++){
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        int p1 = 0, p2 = 1;
        double minimumDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);

        for(int i = 0;i<points.length;i++){
            for(int j = i+1;j<points.length;j++){
                double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);

                if(minimumDistance == distance){
                    System.out.println("The closest two points are ("+points[i][0]+", "+points[i][1]+") and ("+points[j][0]+", "+points[j][1]+")");
                }
            }
        }
        System.out.println("Their distance is "+minimumDistance);
        input.close();
    }
    public static double distance(double x1, double y1, double x2, double y2){
        double distance = Math.sqrt(((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
        return distance;
    }
}
