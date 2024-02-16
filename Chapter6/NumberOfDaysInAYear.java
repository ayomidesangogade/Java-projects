package Chapter6;

public class NumberOfDaysInAYear {
    public static void main(String[]args){
        System.out.println("Year\t\tNumber of days in the year");
        int i = 2000;
        while(i<=2020){
            System.out.println(i+"\t\t"+numberOfDaysInAYear(i));
            i++;
        }
    }
    public static int numberOfDaysInAYear(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            return 366;
        else 
            return 365;
    }
}
