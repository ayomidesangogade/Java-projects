package Exercises;

public class NumberOfDaysInAMonth{
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter (1 for January, 2 for february, 3 for March, 4 for April, 5 for May, 6 for June, 7 for july, 8 for August, 9 for September, 10 for October, 11 for November, 12 for December)");
        System.out.print("Enter month: ");
        int month = input.nextInt();
        System.out.print("Enter year: ");
        int year = input.nextInt();
        int days = 0;
        if (month == 2){
            if (year%4 == 0 && year%100!=0 || year%400 == 0)
                days = 29;
            else
                days = 28;
        }
        else if(month == 4||month == 6||month == 9||month == 11)
            days = 30;
        else 
            days = 31;
        switch(month){
            case 1:
                System.out.println("January "+year+" had "+days+" days.");
                break;
            case 2:
                System.out.println("February "+year+" had "+days+" days.");
                break;
            case 3:
                System.out.println("March "+year+" had "+days+" days.");
                break;
            case 4:
                System.out.println("April "+year+" had "+days+" days.");
                break;
            case 5:
                System.out.println("May "+year+" had "+days+" days.");
                break;
            case 6:
                System.out.println("June "+year+" had "+days+" days.");
                break;
            case 7:
                System.out.println("July "+year+" had "+days+" days.");
                break;
            case 8:
                System.out.println("August "+year+" had "+days+" days.");
                break;
            case 9:
                System.out.println("September "+year+" had "+days+" days.");
                break;
            case 10:
                System.out.println("October "+year+" had "+days+" days.");
                break;
            case 11:
                System.out.println("November "+year+" had "+days+" days.");
                break;
            case 12:
                System.out.println("December "+year+" had "+days+" days.");
                break;
        }
        input.close();
    }
}
