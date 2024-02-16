package Chapter6;

public class ConvertMilliseconds {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter milliseconds: ");
        long milliSeconds = input.nextLong();

        System.out.println(convertMillis(milliSeconds));
        input.close();
    }
    public static String convertMillis(long millis){
        long totalSeconds = millis/1000;
        long currentSeconds = totalSeconds%60;
        long totalMinutes = totalSeconds/60;
        long currentMinutes = totalMinutes%60;
        long totalHours = totalMinutes/60;
        long currentHours = totalHours;
        
        String currentSecondString = currentSeconds + "";
        String currentMinutesString = currentMinutes + "";
        String currentHoursString = currentHours + "";
        String time = currentHoursString+":"+currentMinutesString+":"+currentSecondString;

        return time;
    }
}
