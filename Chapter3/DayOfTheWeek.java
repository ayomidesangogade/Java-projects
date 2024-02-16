package Chapter3;

public class DayOfTheWeek{
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter year (e.g. 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();
        int previousYearMonth = 0;
        if(month == 1)
            previousYearMonth = 13;
        else if(month == 2)
            previousYearMonth = 14;
        else
            previousYearMonth = month;
        System.out.print("Enter the day of the month (1-31): ");
        int dayOfMonth = input.nextInt();
        int k = 0;
        int j = 0;
        int h = 0;
        if (month == 1 || month == 2){
            k = (year-1)%100;
            j = (year-1)/100;
            h = (dayOfMonth+((26*(previousYearMonth+1))/10)+k+(k/4)+(j/4)+5*j)%7;
        switch(h){
            case 0:
                System.out.println("Day of the week is Saturday.");
                break;
            case 1:
                System.out.println("Day of the week is Sunday.");
                break;
            case 2:
                System.out.println("Day of the week is Monday.");
                break;
            case 3:
                System.out.println("Day of the week is Tuesday.");
                break;
            case 4:
                System.out.println("Day of the week is Wednesday.");
                break;
            case 5:
                System.out.println("Day of the week is Thursday.");
                break;
            case 6:
                System.out.println("Day of the week is Friday.");
                break;
        }
    }
    else{
        k = (year)%100;
        j = (year)/100;
        h = (dayOfMonth+((26*(previousYearMonth+1))/10)+k+(k/4)+(j/4)+5*j)%7;
        switch(h){
            case 0:
                System.out.println("Day of the week is Saturday.");
                break;
            case 1:
                System.out.println("Day of the week is Sunday.");
                break;
            case 2:
                System.out.println("Day of the week is Monday.");
                break;
            case 3:
                System.out.println("Day of the week is Tuesday.");
                break;
            case 4:
                System.out.println("Day of the week is Wednesday.");
                break;
            case 5:
                System.out.println("Day of the week is Thursday.");
                break;
            case 6:
                System.out.println("Day of the week is Friday.");
                break;
        }
    }
        input.close();
    }
}