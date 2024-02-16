package Chapter7;

public class PatternRecognition {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int n = input.nextInt();
        int[] values = new int[n];
        System.out.print("Enter the values: ");
        int i = 0;
        while(i<values.length){
            values[i] = input.nextInt();
            i++;
        }
        printStatement(values);
        input.close();
    }
    public static boolean isConsecutiveFour(int[] values){
        if(counter(values) >= 4)
            return true;
        else
            return false;
    }
    public static int counter(int[] values){
        int index = 0;
        String in = "";
        for(int i = 0;i<values.length;i++){
            for(int j = 0;j<index;j++){
                if(values[i] == values[j]){
                    in += j;
                    break;
                }
            }
            index++;
        }
        String charIn = in.charAt(0) + "";
        int b = Integer.parseInt(charIn);
        int count = 0;
        while(b<values.length-1 && values[b] == values[b+1]){
            count++;
            b++;
        }
        return count+1;
    }
    public static void printStatement(int[] values){
        if(isConsecutiveFour(values))
            System.out.println("The list has consecutive fours");
        else
            System.out.println("The list has no consecutive fours");
    }
}
