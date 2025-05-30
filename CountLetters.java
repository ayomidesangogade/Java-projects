
public class CountLetters {
    public static void main(String[]args){
        char [] chars = createArray();
        
        System.out.println("The random lowercase letters are:");
        printArray(chars);
        
        System.out.println();
        int [] counts = countLetters(chars);
        System.out.println("Letters and their number of occurences:");
        printCounts(counts);
    }
    public static char[] createArray(){
        char[] result = new char[100];
        
        for(int i = 0; i<result.length; i++)
            result[i] = getRandomLowerCaseLetters();
        return result;
    }
    public static char getRandomLowerCaseLetters(){
        char ch = (char)('a' + Math.random()*(('z' - 'a') + 1));
        return ch;
    }
    public static void printArray(char[] chars){
        for(int i = 0; i<chars.length;i++){
            if((i+1)%20 == 0)
                System.out.println(chars[i]);
            else
                System.out.print(chars[i]+" ");
        }
    }
    public static int[] countLetters(char[] chars){
        int[] counts = new int[26];
        for(int i = 0; i<chars.length; i++)
            counts[chars[i]-'a']++;
        return counts;
    }
    public static void printCounts(int[] counts){
        for(int i = 0; i<counts.length;i++){
            if((i+1)%10 == 0)
                System.out.println(counts[i]+" "+(char)('a'+i));
            else
                System.out.print(counts[i]+" "+(char)('a'+i)+" ");
        }
    }
}