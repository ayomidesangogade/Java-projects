package Chapter6;

public class EstimatePI {
    public static void main(String[]args){
        System.out.println("i\t\tm(i)");
        int i = 1;
        while(i<=901){
            System.out.printf("%d\t\t%.4f\n",i,estimatePI(i));
            i+=100;
        }
    }
    public static double estimatePI(double i){
        double m = 0;
        for(int j = 1; j<=i;j++){
            m += Math.pow(-1,j+1)/(2*j - 1);
        }
        return 4*m;
    }
}
