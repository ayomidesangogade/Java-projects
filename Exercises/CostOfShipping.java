package Exercises;

public class CostOfShipping {
public static void main(String[]args){
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter weight in pounds: ");
    double weight = input.nextDouble();
    double costInDollars = 0;
    if(weight>= 0 && weight<= 1)
        costInDollars = 3.5;
    else if(weight >= 1 && weight <= 3)
        costInDollars = 5.5;
    else if(weight >= 3 && weight <= 10)
        costInDollars = 8.5;
    else if(weight >= 10 && weight <= 49)
        costInDollars = 10.5;
    else if (weight >= 50){
        System.out.println("The package can not be shipped.");
        System.exit(0);
    }
    System.out.println("Cost of shipping = $"+costInDollars);
    input.close();
}
}
