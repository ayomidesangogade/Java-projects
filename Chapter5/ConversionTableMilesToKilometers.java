package Chapter5;

public class ConversionTableMilesToKilometers {
    public static void main(String[]args){
        System.out.println("Miles\tKilometers\t|\tKilometers\tMiles");
        for(int i = 1, j = 20; i <= 10 && j <= 65; i++, j+= 5){
            double kilometers = 1.609*i;
            double miles = j/1.609;
            System.out.printf("%d\t\t%.3f\t|\t%d\t\t%.3f\n",i,kilometers,j,miles);
        }
    }
}