package Chapter6;

public class NumberOfOccurencesOfSpecifiedCharacter {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter string: ");
        String str = input.nextLine();

        System.out.print("Enter character e.g 'a': ");
        char ch = input.nextLine().charAt(0);

        System.out.println("The character '"+ch+"' appears "+count(str, ch)+" times in the string \""+str+"\"");
        input.close();
    }
    public static int count(String str, char a){
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == a)
                count++;
        }
        return count;
    }
}
