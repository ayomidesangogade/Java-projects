package Chapter4;

public class StudentStatusAndMajors {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter two characters: ");
        String status = input.nextLine();
        if(status.length() != 2){
            System.out.println("Error: You are to enter two characters.");
            System.exit(1);
        }
        statusChecker(status);
        input.close();
    }
    public static void statusChecker(String status){
        if(Character.toUpperCase(status.charAt(0)) == 'M' && status.charAt(1) == '1')
            System.out.println("Mathematics Freshman");
        else if(Character.toUpperCase(status.charAt(0)) == 'M' && status.charAt(1) == '2')
            System.out.println("Mathematics Sophomore");
        else if(Character.toUpperCase(status.charAt(0)) == 'M' && status.charAt(1) == '3')
            System.out.println("Mathematics Junior");
        else if(Character.toUpperCase(status.charAt(0)) == 'M' && status.charAt(1) == '4')
            System.out.println("Mathematics Senior");
        else if(Character.toUpperCase(status.charAt(0)) == 'C' && status.charAt(1) == '1')
            System.out.println("Computer Science Freshman");
        else if(Character.toUpperCase(status.charAt(0)) == 'C' && status.charAt(1) == '2')
            System.out.println("Computer Science Sophomore");
        else if(Character.toUpperCase(status.charAt(0)) == 'C' && status.charAt(1) == '3')
            System.out.println("Computer Science Junior");
        else if(Character.toUpperCase(status.charAt(0)) == 'C' && status.charAt(1) == '4')
            System.out.println("Computer Science Senior");
        else if(Character.toUpperCase(status.charAt(0)) == 'I' && status.charAt(1) == '1')
            System.out.println("Information Technology Freshman");
        else if(Character.toUpperCase(status.charAt(0)) == 'I' && status.charAt(1) == '2')
            System.out.println("Information Technology Sophomore");
        else if(Character.toUpperCase(status.charAt(0)) == 'I' && status.charAt(1) == '3')
            System.out.println("Information Tecnology Junior");
        else if(Character.toUpperCase(status.charAt(0)) == 'I' && status.charAt(1) == '4')
            System.out.println("Information Technology Senior");
    }
}
