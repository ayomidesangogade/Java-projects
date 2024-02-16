package Chapter4;

public class CheckSSN {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Please enter your SSN in this format DDD-DD-DDDD");
        System.out.print("Enter a SSN: ");
        String ssn = input.nextLine();
        if(ssn.length() != 11){
            System.out.println("Error: Your SSN must be eleven digits.");
            System.exit(1);
        }
        ssnChecker(ssn);
        input.close();
    }
    public static void ssnChecker(String ssn){
        String test = ssn.substring(0,3)+"-"+ssn.substring(4, 6)+"-"+ssn.substring(7,11);
        if(ssn.equals(test))
            System.out.println(ssn+" is a valid social security number.");
        else
            System.out.println(ssn+" is an invalid social security number.");
    }
}
