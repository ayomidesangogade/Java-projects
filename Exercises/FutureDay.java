public class FutureDay {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("(0 for Sunday, 1 for Monday, 2 for Tuesday, 3 for Wednesday, 4 for Thursday, 5 for Friday, 6 for Saturday)");
        System.out.print("Enter today's day: ");
        int today = input.nextInt();
        String day = "";
        if(today == 0)
            day = "Sunday";
        else if(today == 1)
            day = "Monday";
        else if(today == 2)
            day = "Tuesday";
        else if(today == 3)
            day = "Wednesday";
        else if(today == 4)
            day = "Thursday";
        else if(today == 5)
            day = "Friday";
        else if(today == 6)
            day = "Saturday";
        System.out.print("Enter the number of days elapsed since today: ");
        int future = input.nextInt();
        int futureDay = (today+future)%7;
        switch(futureDay){
            case 0:
                System.out.println("Today is "+day+" and the future day is Sunday");
                break;
            case 1:
                System.out.println("Today is "+day+" and the future day is Monday");
                break;
            case 2:
                System.out.println("Today is "+day+" and the future day is Tuesday");
                break;
            case 3:
                System.out.println("Today is "+day+" and the future day is Wednesday");
                break;
            case 4:
                System.out.println("Today is "+day+" and the future day is Thursday");
                break;
            case 5:
                System.out.println("Today is "+day+" and the future day is Friday");
                break;
            case 6:
                System.out.println("Today is "+day+" and the future day is Saturday");
                break;
        }
        input.close();
    }
}
