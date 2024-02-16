package Chapter5;

public class PositiveNegativeAverage {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int number = 1;
        int count = 0;
        int positive = 0;
        int negative = 0;
        int sum = 0;
        while(number != 0){
            System.out.print("Enter an integer, the input ends if it is 0: ");
            number = input.nextInt();
            if(number == 0)
                break;
            count++;
            sum += number;
            if(number > 0)
                positive++;
            else if(number < 0)
                negative++;
        }
        System.out.println("The number of positives is "+positive);
        System.out.println("The number of negatives is "+negative);
        System.out.println("The total is "+sum);
        System.out.println("The average is "+(sum/(float)count));
        System.out.println(number);
        input.close();
    }
}
