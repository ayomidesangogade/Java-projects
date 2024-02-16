package Chapter7;

public class AssignGrades{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        int[] scores = new int[n];
        System.out.print("Enter "+n+" scores: ");
        for(int i = 0; i<n; i++)
            scores[i] = input.nextInt();
        displayGrades(scores);
        input.close();
    }
    public static int best(int[] scores){
        int best = scores[0];

        for(int i = 1;i<scores.length;i++){
            if(scores[i] > best)
                best = scores[i];
        }
        return best;
    }
    public static char grade(int score, int[] scores){
        if(score >= (best(scores) - 10))
            return 'A';
        else if(score >= (best(scores) - 20))
            return 'B';
        else if(score >= (best(scores) - 30))
            return 'C';
        else if(score >= (best(scores) - 40))
            return 'D';
        else
            return 'F';
    }
    public static void displayGrades(int[] scores){
        for(int i = 0;i<scores.length;i++)
            System.out.println("Student "+i+" score is "+scores[i]+" and grade is "+grade(scores[i], scores));
    }
}