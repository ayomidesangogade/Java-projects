package Chapter5;

public class CountUppercase {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        int uppercase = 0;
        for(int i = 0; i<=string.length()-1;i++){
            if(Character.isUpperCase(string.charAt(i)))
                uppercase++;
        }
        System.out.println("The number of uppercase letters is "+uppercase);
        input.close();
    }
}
