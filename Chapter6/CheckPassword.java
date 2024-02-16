package Chapter6;

public class CheckPassword {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter password: ");
        String password = input.nextLine();

        if(eightLength(password)){
            if(containsOnlyLettersAndDigits(password)){
                if(containsAtleastTwoDigits(password))
                    System.out.println("Valid Password.");
                else
                    System.out.println("Invalid Password, password must contain at least two digits.");
            }
            else
                System.out.println("Invalid Password, password must contain only letters and digits.");
        }
        else
            System.out.println("Invalid Password, password must be eight in length.");
        input.close();
    }
    public static boolean eightLength(String password){
        if(password.length() == 8)
            return true;
        else
            return false;
    }
    public static boolean containsOnlyLettersAndDigits(String password){
        boolean isCorrect = false;
        for(int i = 0; i<password.length();i++){
            char ch = password.charAt(i);
            if(Character.isLetterOrDigit(ch))
                isCorrect = true;
        }
        if(isCorrect)
            return true;
        else
            return false;
    }
    public static boolean containsAtleastTwoDigits(String password){
        int count = 0;
        for(int i = 0; i<password.length();i++){
            char ch = password.charAt(i);
            if(Character.isDigit(ch))
                count++;
        }
        if(count>=2)
            return true;
        else
            return false;
    }
}
