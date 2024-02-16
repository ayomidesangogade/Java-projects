package Chapter6;

public class DisplayCharacters {
    public static void main(String[]args){
        char ch1 = '1';
        char ch2 = 'Z';
        int numberPerLine = 10;
        printChars(ch1, ch2, numberPerLine);
    }
    public static void printChars(char ch1, char ch2, int numberPerLine){
        int count = 0;
        for(int i = (int)ch1; i<= (int)ch2; i++){
            count++;
            if(count%numberPerLine == 0)
                System.out.println((char)i);
            else
                System.out.print((char)i+" ");
        }
        
    }
}
