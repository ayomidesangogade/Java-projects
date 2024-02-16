package Chapter5;

public class ConversionTableKiloToPoundsToKilo {
    public static void main(String[]args){
        System.out.println("Kilograms\tPounds\t|\tPounds\tKilograms");
        for(int i = 1, j = 20; i<=200 && j<= 520; i+=2, j+=5){
            float pounds = 2.2f*i;
            double kilograms = j/2.2;
            System.out.printf("%d\t\t%.1f\t|\t%d\t\t%.2f\n",i,pounds,j,kilograms);
        } 
    }
}
