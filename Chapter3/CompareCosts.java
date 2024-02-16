package Chapter3;

public class CompareCosts {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        double betterPrice1 = weight1/price1;

        System.out.print("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();
        double betterPrice2 = weight2/price2;

        if(betterPrice1 > betterPrice2)
            System.out.println("Package 1 has a better price.");
        else if(betterPrice1 == betterPrice2)
            System.out.println("The two packages have the same price.");
        else
            System.out.println("Package 2 has a better price.");
        input.close();
    }
}
