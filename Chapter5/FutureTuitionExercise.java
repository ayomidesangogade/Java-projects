package Chapter5;

public class FutureTuitionExercise {
    public static void main(String[]args){
        int i = 0;
        double tuition = 10000;
        while(i<=9){
            tuition += 500;
            i++;
        }
        System.out.println("The tuition would be $"+tuition+" in 10 years.");
        int j = 0;
        while(j<=3){
            tuition += 500;
            j++;
        }
        System.out.println("The tuition would be $"+tuition+" in 14 years.");
    }
}
