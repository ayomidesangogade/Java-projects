package Chapter7;

public class AnalyseScores {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter a negative number to stop accepting values.");
        double[] list = new double[100];

        System.out.print("Enter scores: ");
        int i = 0;
        double number = 1;
        while(number >= 0){
            number = input.nextDouble();
            list[i] = number;
            i++;
        }
        determinant(list);
        input.close();
    }
    public static double average(double[] list){
        double sum = 0;
        for(int i = 0; i<list.length;i++){
            if(list[i] > 0)
                sum += list[i];
        }
        return sum/2;
    }
    public static void determinant(double[] list){
        int count = 0;

        for(int i = 0; i<list.length;i++){
            if(list[i] >= average(list))
                count++;
        }
        if(count > 1)
            System.out.println("There are "+count+" scores greater than or equal to the average "+average(list));
        else
            System.out.println("There is "+count+" score greater than or equal to the average "+average(list));
    }
}
