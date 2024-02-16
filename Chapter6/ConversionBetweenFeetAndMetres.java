package Chapter6;

public class ConversionBetweenFeetAndMetres {
    public static void main(String[]args){
        System.out.println("Feet\t\tMetres\t|\tMetres\t\tFeet");
        System.out.println("--------------------------------------------------------");
        double i = 1;
        double j = 20;
        while(i <= 10 && j <= 65){
            System.out.printf("%.1f\t\t%.3f\t|\t%.1f\t\t%.3f\n",i,footToMetre(i),j,metreToFoot(j));
            i++;
            j+=5;
        }
    }
    public static double footToMetre(double foot){
        double metre = 0.305 * foot;
        return metre;
    }
    public static double metreToFoot(double metre){
        double foot = 3.279 * metre;
        return foot;
    }
}
