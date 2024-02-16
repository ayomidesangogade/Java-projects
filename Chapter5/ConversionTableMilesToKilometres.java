package Chapter5;

public class ConversionTableMilesToKilometres {
    public static void main(String[]args){
        System.out.printf("%s\t\t%s\n","Miles","Kilometers");
        for(int i =1;i<=10;i++){
            double kilometers = 1.609*i;
            System.out.printf("%d\t\t%-3.3f\n",i,kilometers);
        }
    }
}
