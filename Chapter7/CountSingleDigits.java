package Chapter7;

public class CountSingleDigits {
    public static void main(String[] args){
        char[] charDigits = createRandomSingleDigitsArray();

        System.out.println("The random single digits are: ");
        displayRandomSingleDigits(charDigits);
        System.out.println();

        int[] counts = createCountsArray(charDigits);
        System.out.println("The single digits and their number of occurences: ");
        displayCounts(counts);
    }
    public static char[] createRandomSingleDigitsArray(){
        char[] result = new char[100];
        for(int i = 0; i<result.length;i++){
            result[i] = (char)('0' + Math.random()*('9' - '0' + 1));
        }
        return result;
    }
    public static void displayRandomSingleDigits(char[] list){
        for(int i = 0; i<list.length;i++){
            if((i+1) % 20 == 0)
                System.out.println(list[i]);
            else
                System.out.print(list[i]+" ");
        }
    }
    public static int[] createCountsArray(char[] chars){
        int[] counts = new int[10];
        for(int i = 0; i<chars.length;i++)
            counts[chars[i] - '0']++;
        return counts;
    }
    public static void displayCounts(int[] counts){
        for(int i = 0;i<counts.length;i++)
            System.out.print(counts[i]+" '"+(char)(i + '0')+"'"+", ");
    }
}
