package Chapter8;

public class CentralCity {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        int n = input.nextInt();
        System.out.print("Enter the coordinates of the cities: ");
        double[][] cities = new double[n][2];
        for(int i = 0;i<cities.length;i++){
            cities[i][0] = input.nextDouble();
            cities[i][1] = input.nextDouble();
        }

        int p1 = 0;
        // double distance = distance(cities[p1][0], cities[p1][1], cities[p2][0], cities[p2][1]);

        double totalDistance = 0;
        for(int i = 0;i<cities.length;i++){
            totalDistance += distance(cities[p1][0], cities[p1][1], cities[i][0], cities[i][1]);
        }

        System.out.println("The central city is at ("+cities[p1][0]+", "+cities[p1][1]+")");
        System.out.println("The total distance to all other cities is "+((Math.round(totalDistance*100))/100.0));
        input.close();
    }
    public static double distance(double x1, double y1, double x2, double y2){
        double distance = Math.sqrt(((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
        return distance;
    }
}
