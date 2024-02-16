package Chapter5;

public class ConversionTableKilogramsToPounds {
    public static void main(String[]args){
        System.out.printf("%s %11s\n","Kilograms","Pounds");
        for(int i = 1; i<=200; i+=2){
            float pounds = 2.2f*i;
            System.out.printf("%-3d %17.1f\n",i,pounds);
        }
    }
}
