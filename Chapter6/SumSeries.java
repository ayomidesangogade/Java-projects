package Chapter6;

public class SumSeries {
    public static void main(String[]args){
        System.out.println("i\t\tm(i)");
        for(int i = 1; i<=20; i++){
            System.out.printf("%d\t\t%.4f\n",i,sumFormula((double)i));
        }
    }
    public static double sumFormula(double i){
        double m = i/(i+1);
        return m;
    }
}
