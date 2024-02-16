package Chapter4;

public class OrderThreeCities {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();
        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();
        orderChecker(city1,city2,city3);
        input.close();
    }
    public static void orderChecker(String city1, String city2, String city3){
        if(city1.compareTo(city2) < 0 && city1.compareTo(city3) < 0 && city2.compareTo(city3) < 0)
            System.out.println("The three cities in aplhabetical order are "+city1+" "+city2+" "+city3);
        else if(city1.compareTo(city2) < 0 && city1.compareTo(city3) < 0 && city3.compareTo(city2) < 0)
            System.out.println("The three cities in aplhabetical order are "+city1+" "+city3+" "+city2);
        else if(city2.compareTo(city1) < 0 && city2.compareTo(city3) < 0 && city1.compareTo(city3)<0)
            System.out.println("The three cities in aplhabetical order are "+city2+" "+city1+" "+city3);
        else if(city3.compareTo(city1) < 0 && city3.compareTo(city2) < 0 && city2.compareTo(city1) < 0)
            System.out.println("The three cities in aplhabetical order are "+city3+" "+city2+" "+city1);
        else if(city3.compareTo(city1) < 0 && city3.compareTo(city2) < 0 && city1.compareTo(city2) < 0)
            System.out.println("The three cities in aplhabetical order are "+city3+" "+city1+" "+city2);
        else if(city2.compareTo(city3) < 0 && city2.compareTo(city1) < 0 && city3.compareTo(city1) < 0)
            System.out.println("The three cities in aplhabetical order are "+city2+" "+city3+" "+city1);
    }
}