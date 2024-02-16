package Chapter7;

import java.util.*;

public class SortStudents {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = input.nextInt();

        String[] names = new String[number];
        int[] scores = new int[number];

        int i = 0;
        while(i<number){
            System.out.print("Enter "+(i+1)+" student's name: ");
            names[i] = input.next();
            System.out.print("Enter "+(i+1)+" student's score: ");
            scores[i] = input.nextInt();

            i++;
        }
        System.out.println();
        printNamesAndScores(names, scores);
        input.close();
    }
    public static int[] reverseScores(int[] scores){
        int[] result = new int[scores.length];
        int[] result1 = new int[scores.length];
        for(int i = 0;i<scores.length;i++){
            result[i] = scores[i];
            result1[i] = scores[i];
        }
        Arrays.parallelSort(result);
        for(int i = 0, j = result.length-1; i<result.length;i++,j--){
            result1[i] = result[j];
        }
        return result1;
    }
    public static String[] arrangeNames(int[] scores, String[] names){
        int[] result = reverseScores(scores);
        String[] newNames1 = new String[names.length];

        for(int i = 0;i<scores.length;i++){
            
            for(int j = 0;j<scores.length;j++){
                if(scores[i] == result[j])
                    newNames1[j] = names[i];
            }
        }
        return newNames1;
    }
    public static void printNamesAndScores(String[] names, int[] scores){
        String[] newNames = arrangeNames(scores, names);
        int[] newScores = reverseScores(scores);

        System.out.println("Names\tScores");
        for(int i = 0; i<scores.length;i++){
            System.out.println(newNames[i]+"\t"+newScores[i]);
        }
    }
}
