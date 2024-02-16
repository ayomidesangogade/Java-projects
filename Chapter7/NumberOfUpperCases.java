package Chapter7;

public class NumberOfUpperCases {
    public static void main(String[] args){
        int count = 0;
        for(int i = 0;i<args[0].length();i++){
            if(Character.isUpperCase(args[0].charAt(i)))
                count++;
        }
        System.out.println("The number of uppercase letters in the string is "+count);
    }
}
