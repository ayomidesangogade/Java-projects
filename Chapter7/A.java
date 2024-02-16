package Chapter7;

public class A {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        String[] strings = new String[3];
        for(int i = 0; i<strings.length;i++)
            strings[i] = input.nextLine();
        TestMain.main(strings);
        input.close();
    }
}
