package Chapter8;

public class GradeExam {
    public static void main(String[] args){
        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        correctCounts(answers, key);
    }
    public static void correctCounts(char[][] answers, char[] key){
        int[] counts = new int[answers.length];
        for(int row = 0;row<answers.length;row++){
            int correctCounts = 0;
            for(int column = 0; column<answers[row].length;column++){
                if(answers[row][column] == key[column]){
                    correctCounts++;
                }
            }
            counts[row] = correctCounts;
        }

        int firstCorrectCount = counts[0];
        int firstCorrectCountIndex = 0;

        for(int i = 1;i<counts.length;i++){
            if(counts[i]>firstCorrectCount){
                firstCorrectCount = counts[i];
                firstCorrectCountIndex = i;
            }
        }
        System.out.println("Student "+firstCorrectCountIndex+" has the highest count of "+firstCorrectCount);
        System.out.println();
        sortCounts(counts);
    }
    public static void sortCounts(int[] counts){
        int[] result = new int[counts.length];
        int[] students = {0,1,2,3,4,5,6,7};
        int[] newStudents = new int[students.length];
        for(int i = 0;i<counts.length;i++){
            result[i] = counts[i];
        }
        for(int i = 1;i<counts.length;i++){
            for(int j = 1;j<counts.length;j++){
                if(counts[j]<counts[j-1]){
                    int temp = counts[j]; counts[j] = counts[j-1]; counts[j-1] = temp;
                }
            }
        }
        for(int k = 0;k<counts.length;k++){
            for(int i = 0;i<counts.length;i++){
                if(counts[k] == result[i])
                    newStudents[k] = students[i];
            }
        }
        print(newStudents, counts);
    }
    public static void print(int[] newStudents, int[] counts){
        for(int i = 0;i<counts.length;i++){
            System.out.println("Student "+newStudents[i]+"'s correct count is "+counts[i]);
        }
    }
}
