package Chapter7;

public class Checker {
    public static boolean thirdChecker(String choice, String replaced, char letter){
        int count = 0;
        for(int i = 0;i<choice.length();i++){
            if(letter == choice.charAt(i))
                count++;
        }
        int count1 = 0;
        for(int j = 0;j<replaced.length();j++){
            if(letter == replaced.charAt(j))
                count1++;
        }
        if(count == count1)
            return true;
        else 
            return false;
    }
    public static boolean checker(char letter, String choice){
        for(int i = 0;i<choice.length();i++){
            if(letter == choice.charAt(i))
                return true;
        }
        return false;
    }
    public static boolean secondChecker(char letter, String replaced){
        for(int i = 0; i<replaced.length();i++){
            if(letter == replaced.charAt(i))
                return true;
        }
        return false;
    }
}
