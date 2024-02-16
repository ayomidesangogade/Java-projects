package Chapter3;

public class PrintGrade {
    public static void printGrade(double score){
        if (score >= 70)
            System.out.println("A");
        else if(score <= 69 && score <= 60)
            System.out.println("B");
        else if(score <= 59 && score <= 50)
            System.out.println("C");
        else if(score <= 49 && score <= 40)
            System.out.println("D");
        else if(score <= 39 && score <= 30)
            System.out.println("E");
        else
            System.out.println("F");
    }

    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter score: ");
        double score = input.nextDouble();
        printGrade(score);
        input.close();
    }
}
