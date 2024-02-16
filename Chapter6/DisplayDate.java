package Chapter6;

public class DisplayDate {
    public static void main(String[]args){
        java.util.Date currentDate = new java.util.Date();
        java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(currentDate);

        System.out.println("Current Date: "+formattedDate);
    }
}
