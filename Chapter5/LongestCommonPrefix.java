package Chapter5;

public class LongestCommonPrefix {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter first string: ");
        String string1 = input.nextLine();

        System.out.print("Enter second string: ");
        String string2 = input.nextLine();

        int i = 0;
        String samePrefix = "";
        boolean flag = false;
        while(string1.charAt(i) == string2.charAt(i)){
            if(string1.charAt(i) == string2.charAt(i)){
                samePrefix += string1.charAt(i);
                flag = true;
            }
            i++;
        }
        if(flag)
            System.out.println("The common prefix is "+samePrefix);
        else
            System.out.println(string1+" and "+string2+" have no common prefix.");
        input.close();
    }
}
