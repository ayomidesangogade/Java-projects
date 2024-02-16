package Chapter6;

public class FormatAnInteger {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();

        System.out.print("Enter width: ");
        int width = input.nextInt();
        System.out.println(format(number, width));
        input.close();
    }
    public static String format(int number, int width){
        String numString = number + "";
        int index = width - numString.length();
        if(index > 0){
            String widthFormatString = "";
            for(int i = 0; i<width;i++)
                widthFormatString += "0";
            return widthFormatString.substring(0, index)+numString;
        }
        else
            return numString;
    }
}
