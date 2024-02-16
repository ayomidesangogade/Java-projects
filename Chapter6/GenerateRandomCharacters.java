package Chapter6;

public class GenerateRandomCharacters {
    public static void main(String[]args){
        int i = 0;
        int count = 0;
        while(i<=100){
            count++;
            if(count%50 == 0)
                System.out.println(generateRandomCharacters());
            else
                System.out.print(generateRandomCharacters()+" ");
            i++;
        }
        System.out.println();
        int j = 0;
        int count1 = 0;
        while(j<=100){
            count1++;
            if(count1%50 == 0)
                System.out.println(generateSingleDigitsCharacters());
            else
                System.out.print(generateSingleDigitsCharacters()+" ");
            j++;
        }
    }
    public static char generateRandomCharacters(){
        char ch = (char)('A' + Math.random()*(('Z'-'A')+1));
        return ch;
    }
    public static char generateSingleDigitsCharacters(){
        char ch = (char)('0' + Math.random()*(('9'-'0')+1));
        return ch;
    }
}
