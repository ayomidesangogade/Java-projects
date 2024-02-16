package Chapter4;

public class DaysOfAMonth {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Please enter the first three letters of a month name with the first letter in uppercase.");
        System.out.print("Enter a month: ");
        String month = input.nextLine();
        if(month.length() != 3){
            System.out.println("Error: You are to enter the first three letters of a month name.");
            System.exit(1);
        }
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        dayOfMonthChecker(month, year);
        input.close();
    }
    public static boolean isLeapYear(int year){
        if(year % 4 == 0 || year % 400 == 0 && year % 100 != 0)
            return true;
        else
            return false;
    }
    public static void dayOfMonthChecker(String month, int year){
        if(month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul") || month.equals("Aug") || month.equals("Oct") || month.equals("Dec"))
            System.out.println(month+" "+year+" has 31 days.");
        else if(month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov"))
            System.out.println(month+" "+year+" has 30 days.");
        else if(month.equals("Feb") && isLeapYear(year) == true)
            System.out.println(month+" "+year+" has 29 days.");
        else if(month.equals("Feb") && isLeapYear(year) == false)
            System.out.println(month+" "+year+" has 28 days.");
        else
            System.out.println(month+" is not a correct month name.");
    }
}
