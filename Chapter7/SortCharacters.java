package Chapter7;

public class SortCharacters {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        System.out.println("The sorted string is "+sort(s));
        input.close();
    }
    public static String sort(String s){
        char[] chars = new char[s.length()];
        for(int i = 0;i<s.length();i++){
            chars[i] = s.charAt(i);
        }

        for(int i = 1;i<chars.length;i++){
            for(int j = 1;j<chars.length;j++){
                if(chars[j]<chars[j-1]){
                    char temp = chars[j]; chars[j] = chars[j-1]; chars[j-1] = temp;
                }
            }
        }
        String sortedString = "";
        for(char item: chars)
            sortedString += item;
        return sortedString;
    }
}
