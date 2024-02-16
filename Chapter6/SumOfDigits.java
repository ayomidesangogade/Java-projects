package Chapter6;

public class SumOfDigits {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = input.nextLine();

        System.out.println("The sum of all digits in the number is "+sumDigits(number));
        input.close();
    }
    public static int sumDigits(String number){
        int sum = 0;
        for(int i = 0; i<number.length(); i++){
            sum += Integer.parseInt(number.substring(i, i+1));
        }
        return sum;
    }
}
