package Chapter4;

public class OrderTwoCities {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter first city: ");
        String city1 = input.nextLine();

        System.out.print("Enter second city: ");
        String city2 = input.nextLine();

        if(city1.compareTo(city2)<0)
            System.out.println("The cities in alphabetical order are "+city1+" "+city2);
        else
            System.out.println("The cities in aphabetical order are "+city2+" "+city1);
        input.close();
    }
}
