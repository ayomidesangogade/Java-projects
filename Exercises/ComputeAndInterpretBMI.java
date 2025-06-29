package Exercises;

import java.util.Scanner;
public class ComputeAndInterpretBMI {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInInches = input.nextDouble();

        final double KILOGRAMS_PER_POUNDS = 0.45359237;
        final double METERS_PER_INCHES = 0.0254;

        double weightInKilograms = weightInPounds*KILOGRAMS_PER_POUNDS;
        double heightInMeters = heightInInches*METERS_PER_INCHES;

        final double BMI = weightInKilograms/(Math.pow(heightInMeters,2));
        System.out.println("BMI is "+BMI);

        if(BMI<18.5)
            System.out.println("Underweight");
        else if(BMI >= 18.5 && BMI < 25)
            System.out.println("Normal");
        else if(BMI >= 25 && BMI < 30)
            System.out.println("Overweight");
        else if(BMI >= 30)
            System.out.println("Obese");
        input.close();
    }
}
