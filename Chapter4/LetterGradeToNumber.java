package Chapter4;

public class LetterGradeToNumber {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        String letter = input.nextLine();
        letterGradeToNumberChecker(letter);
        input.close();
    }
    public static void letterGradeToNumberChecker(String letter){
        char ch = letter.charAt(0);
        if(ch == 'A')
            System.out.println("The numeric value for grade "+ch+" is 4.");
        else if(ch == 'B')
            System.out.println("The numeric value for grade "+ch+" is 3.");
        else if(ch == 'C')
            System.out.println("The numeric value for grade "+ch+" is 2.");
        else if(ch == 'D')
            System.out.println("The numeric value for grade "+ch+" is 1.");
        else if(ch == 'F')
            System.out.println("The numeric value for grade "+ch+" is 0.");
        else
            System.out.println(ch+" is an invalid grade.");
    }
}
